package sparrow.etl.core.transformer;

import sparrow.etl.core.DataSet;
import sparrow.etl.core.dao.impl.ResultRow;
import sparrow.etl.core.exception.EnrichDataException;
import sparrow.etl.core.exception.RejectionException;
import sparrow.etl.core.vo.DataOutputHolder;

/**
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Saji Venugopalan
 * @version 1.0
 */
public interface DataTransformer
    extends TransformerLCEvent {

  public abstract DataOutputHolder enrichData(DataSet dataSet) throws
      EnrichDataException;
  public abstract void setDriverRowEventListener(DriverRowEventListener
                                                 listener);
  public abstract DriverRowEventListener getDriverRowEventListener();
  public abstract void markForRejection(String reason) throws
      RejectionException;
  public abstract void markForRejection(String reason, Throwable t) throws
      RejectionException;
  public abstract void markForRejection(String reason, boolean hardRejection) throws
      RejectionException;
  public abstract boolean isMarkedForRejection();
  public abstract boolean isSoftRejection();
  public abstract void setDriverRow(ResultRow row);

}
