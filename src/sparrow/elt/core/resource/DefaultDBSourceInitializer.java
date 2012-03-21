package sparrow.elt.core.resource;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import sparrow.elt.core.config.ConfigParam;
import sparrow.elt.core.config.ResourceType;
import sparrow.elt.core.config.SparrowResourceConfig;
import sparrow.elt.core.context.SparrowContext;
import sparrow.elt.core.exception.EventNotifierException;
import sparrow.elt.core.exception.InitializationException;
import sparrow.elt.core.exception.ResourceException;
import sparrow.elt.core.log.SparrowLogger;
import sparrow.elt.core.log.SparrowrLoggerFactory;
import sparrow.elt.core.transaction.SparrowDataSource;
import sparrow.elt.core.transaction.SparrowTransactionManager;
import sparrow.elt.core.util.ConfigKeyConstants;
import sparrow.elt.core.util.Sortable;
import sparrow.elt.core.util.SparrowUtil;

import com.csfb.sg.Utils.Database.ISecureConn;
import com.csfb.sg.Utils.Database.NormalConn;
import com.csfb.sg.Utils.Database.SecureConnFactory;

/**
 *
 * <p>Title: Class DefaultDataSourceInitializer </p>
 * <p>Description: Class DefaultDataSourceInitializer is a Generic Datasource initializer
 * to initialize datasource which are configured in the sparrow-app-config.xml file.</p>
 *
 * <p> It uses Apache BasicDataSource implementation to achive the connection
 * pool and DataSource creation machanism</p>

 * @author Saji Venugopalan
 * @see sparrow.elt.core.dao.GenericResourceInitializer
 * @see sparrow.elt.core.initializer.ApplicationInitializer
 * @version 1.0
 */
public class DefaultDBSourceInitializer
    implements GenericResourceInitializer {

  private static final int DEFAULT_POOL_SIZE = 20;
  private static final boolean DEFAULT_AUTO_COMMIT = true;
  private static final long DEFAULT_MAX_WAIT = 3000;
  private static final int DEFAULT_MIN_IDLE = 5;
  private static final int DEFAULT_MAX_IDLE = 10;

  private static final String DB_ORACLE = "ORACLE";
  private static final String DB_SYBASE = "SYBASE";

  public static final String PARAM_DATASOURCE = "datasource";

  /**
   * Instance variables
   */
  private final SparrowContext context;
  private final ConfigParam param;
  private DataSource ds = null;
  private String userName = null;
  private String password = null;
  private final String resourceName;
  private final boolean poolOnStart;

  /**
   * Holds static refernece of the logger
   */
  private static final SparrowLogger logger = SparrowrLoggerFactory.
      getCurrentInstance(
      DefaultDBSourceInitializer.class);

  /**
   * Default consturctor
   */
  public DefaultDBSourceInitializer(SparrowResourceConfig config) {
    this.context = config.getContext();
    this.param = config.getInitParameter();
    resourceName = config.getName();

    if (!param.isParameterExist(PARAM_DATASOURCE)) {
      SparrowUtil.validateParam(new String[] {ConfigKeyConstants.
                              PARAM_DRIVER_CLASS_NAME,
                              ConfigKeyConstants.PARAM_CONNECTION_URL,
                              ConfigKeyConstants.PARAM_USER_NAME}
                              ,
                              "DefaultDBSourceInitializer[" + resourceName +
                              "]",
                              param);
    }
    poolOnStart = SparrowUtil.performTernary(param,
                                           ConfigKeyConstants.
                                           PARAM_POOL_ON_START, false);

  }

  /**
   * Initialzes Datasource.
   *
   * @param param paramParam
   * @throws InitializationException
   */
  public void initializeResource() {

    try {
      String datasource = param.getParameterValue(PARAM_DATASOURCE);
      if (datasource != null) {
        String[] context_ds = datasource.split("[@]");
        Context ctx = (Context)this.context.getResource(context_ds[0]).
            getResource(Resource.NOT_IN_TRANSACTION);
        this.ds = (DataSource) ctx.lookup(context_ds[1]);

      }
      else {
        BasicDataSource bds = new BasicDataSource();

        checkSecureConnection();

        bds.setDriverClassName(param.getParameterValue(
            ConfigKeyConstants.PARAM_DRIVER_CLASS_NAME));
        bds.setUsername(userName);
        bds.setPassword(password);
        bds.setUrl(param.getParameterValue(
            ConfigKeyConstants.PARAM_CONNECTION_URL));
        bds.setInitialSize(getMaxActive());
        bds.setMaxActive(getMaxActive());
        bds.setMinIdle(getMinIdle());
        bds.setMaxIdle(getMaxIdle());
        bds.setMaxWait(getMaxWait());
        bds.setDefaultAutoCommit(getDefaultAutoCommit());

        this.ds = bds;
        poolConnection();
      }
    }
    catch (InitializationException e) {
      throw e;
    }
    catch (Exception e) {
      throw new InitializationException("RESOURCE_INIT_EXP",
                                        "Exception occured while initializing DataSource [" +
                                        resourceName + "][" + e + "]");
    }
  }

  /**
   * If "defaultAutoCommit" is not paramured then the default value is false
   * @return boolean
   */
  private boolean getDefaultAutoCommit() {
    return SparrowUtil.performTernary(param, ConfigKeyConstants.PARAM_AUTO_COMMIT,
                                    DEFAULT_AUTO_COMMIT);
  }

  /**
   *
   * @return long
   */
  private long getMaxWait() {
    return SparrowUtil.performTernaryForLong(param,
                                           ConfigKeyConstants.PARAM_MAX_WAIT,
                                           DEFAULT_MAX_WAIT);
  }

  /**
   *
   * @return long
   */
  private int getMinIdle() {
    return SparrowUtil.performTernary(param, ConfigKeyConstants.PARAM_MIN_IDEL,
                                    DEFAULT_MIN_IDLE);
  }

  /**
   *
   * @return long
   */
  private int getMaxIdle() {
    return SparrowUtil.performTernary(param, ConfigKeyConstants.PARAM_MAX_IDEL,
                                    DEFAULT_MAX_IDLE);
  }

  /**
   *
   * @param maxActive String
   * @return int
   */
  private int getMaxActive() {
    return SparrowUtil.performTernary(this.param,
                                    ConfigKeyConstants.PARAM_POOL_SIZE,
                                    DEFAULT_POOL_SIZE);
  }

  /**
   * beginApplication
   */
  public void beginApplication() {
    logger.info("Datasource [" + this.resourceName +
                "] has been created. Pool on start [" + poolOnStart + "]");
  }

  /**
   *
   */
  private void poolConnection() throws SQLException {
    if (poolOnStart) {
      int maxPooledConn = getMaxActive();

      Connection[] con = new Connection[maxPooledConn];
      for (int i = 0; i < maxPooledConn; i++) {
        con[i] = ds.getConnection();
      }

      for (int i = 0; i < maxPooledConn; i++) {
        con[i].close();
      }

      con = null;
      logger.info(resourceName + ":[" + maxPooledConn +
                  "] Connection(s) pooled.");
    }
  }

  /**
   * endApplication
   */
  public void endApplication() throws EventNotifierException {
    try {
      if (ds instanceof BasicDataSource) {
        ( (BasicDataSource) ds).close();
      }
      logger.warn("Datasource [" + this.resourceName + "] has been closed");
    }
    catch (SQLException ex) {
      EventNotifierException e = new EventNotifierException("DBINIT_EA_SQL_EXP",
          ex.getErrorCode() + "-" + ex.getMessage());
      logger.error("endApplication:SQLException", ex);
      throw e;
    }
  }

  /**
   *
   * @return ISecureConn
   */
  private void checkSecureConnection() {

    logger.debug("checkSecureConnection called");

    if (!this.param.isParameterExist(ConfigKeyConstants.PARAM_PASSWORD)) {

      NormalConn con = new NormalConn();
      con.userId = getStream();

      String dbType = getDBType();

      ISecureConn sConn = SecureConnFactory.getSecureConn(dbType, con);

      if (sConn.genPasswd()) {
        userName = sConn.getUserId();
        password = sConn.getUserPasswd();
      }

      if (password == null || password.trim().equals("")) {
        throw new InitializationException(
            "Secure Connection returned NULL/empty password:[DB:" + dbType +
            "/Stream:" + con.userId + "/sConn.getUserPasswd:" + password +
            "]");
      }

      logger.debug("PASSWORD : [XXXXX" +
                   password.substring(Math.min(5, userName.length()),
                                      userName.length()) +
                   "]");
    }
    else {
      userName = this.param.getParameterValue(ConfigKeyConstants.
                                              PARAM_USER_NAME);
      password = this.param.getParameterValue(ConfigKeyConstants.PARAM_PASSWORD);
    }
  }

  /**
   *
   * @return String
   */
  private String getDBType() {
    String driver = this.param.getParameterValue(ConfigKeyConstants.
                                                 PARAM_DRIVER_CLASS_NAME);
    if (driver.indexOf("oracle") != -1) {
      return DB_ORACLE;
    }
    else if (driver.indexOf("sybase") != -1) {
      return DB_SYBASE;
    }
    else {
      return null;
    }
  }

  /**
   *
   * @return String
   */
  private String getStream() {
    String userName = SparrowUtil.performTernary(this.param,
                                               ConfigKeyConstants.
                                               PARAM_SECURE_STREAM,
                                               this.
                                               param.getParameterValue(
        ConfigKeyConstants.PARAM_USER_NAME));
    return userName;
  }

  /**
   * getResource
   *
   * @return Resource
   */
  public Resource getResource() {

    Resource resource = new Resource() {

      private final SparrowTransactionManager stm;

      {
        stm = SparrowTransactionManager.getTransactionManager();
      }

      SparrowDataSource sds = null;

      /**
       * getName
       *
       * @return String
       */
      public String getName() {
        return resourceName;
      }

      /**
       * getResource
       *
       * @return Object
       */
      public Object getResource(int transFlag) throws ResourceException {
        Object c = null;

        try {
          c = (transFlag == Resource.IN_TRANSACTION) ? getXAResource() :
              ds.getConnection();
        }
        catch (SQLException ex) {
        ex.printStackTrace();
          throw new ResourceException("SQL_EXCEPTION_CON",
                                      "SQLException occured while obtaining Connection:[" +
                                      getName() + "]:" + ex.getMessage());
        }
        return c;
      }

      /**
       * getType
       *
       * @return int
       */
      public ConfigParam getParam() {
        return param;
      }

      /**
       * getXAResource
       *
       * @return Object
       */
      public Object getXAResource() throws ResourceException {
        Connection c = null;

        try {
          c = getXADataSource().getConnection();
        }
        catch (SQLException ex) {
        	ex.printStackTrace();
          throw new ResourceException(
              "SQL_EXCEPTION_CON", ex);
        }
        return c;
      }

      /**
       *
       * @return SparrowDataSource
       */
      private SparrowDataSource getXADataSource() throws ResourceException {
        if (sds == null) {
          try {
            sds = new SparrowDataSource(getName(), ds);
          }
          catch (Exception ex) {
        	  ex.printStackTrace();
            throw new ResourceException("DB_DATASOURCE_CREATION", ex);
          }
        }
        return sds;
      }

      /**
       * getType
       *
       * @return ResourceType
       */
      public ResourceType getType() {
        return ResourceType.getResourceType("DB");
      }

      /**
       * getResource
       *
       * @return Object
       */
      public Object getResource() throws ResourceException {
        return (stm.isInTransaction()) ? getResource(Resource.IN_TRANSACTION) :
            getResource(Resource.NOT_IN_TRANSACTION);
      }
    };
    return resource;
  }

  /**
   * getPriority
   *
   * @return int
   */
  public int getPriority() {
    return Sortable.PRIORITY_HIGH;
  }

}
