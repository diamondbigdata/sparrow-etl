package sparrow.etl.impl.extractor.jms;

import org.apache.commons.pool.BasePoolableObjectFactory;
import org.apache.commons.pool.impl.StackObjectPool;

import sparrow.etl.core.config.SparrowDataExtractorConfig;
import sparrow.etl.core.dao.metadata.ColumnAttributes;
import sparrow.etl.core.exception.SparrowRuntimeException;
import sparrow.etl.core.log.SparrowLogger;
import sparrow.etl.core.log.SparrowrLoggerFactory;
import sparrow.etl.core.util.ConfigKeyConstants;
import sparrow.etl.core.util.Constants;
import sparrow.etl.core.util.IObjectPoolLifeCycle;
import sparrow.etl.core.util.SparrowUtil;

/**
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Saji Venugopalan
 * @version 1.0
 */
public class SparrowMessageListernerPoolManager
    implements IObjectPoolLifeCycle {

  private StackObjectPool pool;
  private SparrowDataExtractorConfig config;
  private ColumnAttributes[] colAttribs = null;

  private final String msgType;
  private String listernerClass;

  protected static final SparrowLogger logger = SparrowrLoggerFactory.
      getCurrentInstance(
      SparrowMessageListernerPoolManager.class);

  /**
   *
   * @param config SparrowDataExtractorConfig
   */
  public SparrowMessageListernerPoolManager(SparrowDataExtractorConfig config) {
    this.config = config;
    this.pool = new StackObjectPool(new SparrowListernerPoolFactory(this),
                                    100);
    msgType = SparrowUtil.performTernary(config.getInitParameter(),
                                       "message.type", Constants.STRING);

    listernerClass = config.getInitParameter().getParameterValue(
        ConfigKeyConstants.
        PARAM_MSG_LSTNR);

    if (listernerClass == null || listernerClass.trim().equals("")) {
      if (Constants.STRING.equals(msgType)) {
        listernerClass =
            "sparrow.etl.impl.extractor.jms.GenericMessageListener";
      }
      else if (Constants.XML.equals(msgType)) {
        listernerClass =
            "sparrow.etl.impl.extractor.jms.XMLMessageListener";
      }
      logger.info("PARAM [" + ConfigKeyConstants.PARAM_MSG_LSTNR +
            "] is not provided, [" +
            listernerClass + "] will be used");
    }

  }

  /**
   * returned
   *
   * @param o Object
   */
  public void returned(Object o) {
    try {
      pool.returnObject(o);
    }
    catch (Exception ex) {
      throw new SparrowRuntimeException(
          "Exception occured while retruning object to pool [" +
          ex.getMessage() + "]");

    }
  }

  /**
   *
   * @param dtr DataTypeResolver[]
   */
  public void setColDefAttributes(ColumnAttributes[] colAttribs) {
    this.colAttribs = colAttribs;
  }

  /**
   * getUserObject
   *
   * @param context SparrowContext
   * @return UserObject
   */
  public SparrowMessageListener getMessageListener() {
    SparrowMessageListener sml = (SparrowMessageListener) offered();
    sml.initialize();
    return sml;
  }

  /**
   * offered
   *
   * @return Object
   */
  public Object offered() {
    Object usrObj = null;
    try {
      usrObj = pool.borrowObject();
    }
    catch (Exception ex) {
      throw new SparrowRuntimeException(
          "Exception occured while borrowing object from pool [" +
          ex.getMessage() + "]");
    }
    return usrObj;
  }

  /**
   * destroy
   */
  public void destroy() {
    pool.clear();
  }

  /**
   * getSparrowDataExtractorConfig
   *
   * @return SparrowDataExtractorConfig
   */
  public SparrowDataExtractorConfig getSparrowDataExtractorConfig() {
    return config;
  }

  /**
   *
   * <p>Title: </p>
   * <p>Description: </p>
   * <p>Copyright: Copyright (c) 2004</p>
   * <p>Company: </p>
   * @author Saji Venugopalan
   * @version 1.0
   */
  private class SparrowListernerPoolFactory
      extends BasePoolableObjectFactory {

    private IObjectPoolLifeCycle lc = null;

    /**
     * makeObject
     *
     * @return Object
     */
    public SparrowListernerPoolFactory(IObjectPoolLifeCycle lc) {
      this.lc = lc;
    }

    /**
     *
     * @return Object
     */
    public Object makeObject() {

      SparrowMessageListener sml = (SparrowMessageListener) SparrowUtil.createObject(
          listernerClass,
          SparrowDataExtractorConfig.class, config);
      sml.setOLC(lc);
      sml.setColDefAttributes(colAttribs);
      logger.debug("New SparrowMessageListener[" + sml.getClass().getName() +
                   "] Created");
      return sml;
    }

    /**
     *
     * @param obj Object
     */
    public void destroyObject(Object obj) {
      SparrowMessageListener sml = (SparrowMessageListener) obj;
      sml.finalizeObject();
      sml = null;
    }

    /**
     *
     * @param obj Object
     */
    public void passivateObject(Object obj) {
      SparrowMessageListener sml = (SparrowMessageListener) obj;
      sml.destory();
    }

  }

}
