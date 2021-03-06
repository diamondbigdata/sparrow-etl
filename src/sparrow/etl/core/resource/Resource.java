package sparrow.etl.core.resource;

import sparrow.etl.core.config.ConfigParam;
import sparrow.etl.core.config.ResourceType;
import sparrow.etl.core.exception.ResourceException;


/**
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */
public interface Resource {

  public static final int IN_TRANSACTION = 1;
  public static final int NOT_IN_TRANSACTION = 2;

  public abstract String getName();
  public abstract Object getResource(int transFlag) throws ResourceException;
  public abstract Object getResource() throws ResourceException;
  public abstract ConfigParam getParam();
  public abstract ResourceType getType();

}
