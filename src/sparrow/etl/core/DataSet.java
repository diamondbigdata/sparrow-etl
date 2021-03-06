package sparrow.etl.core;

import java.util.Map;

import sparrow.etl.core.dao.impl.RecordSet;
import sparrow.etl.core.dao.impl.ResultRow;
import sparrow.etl.core.exception.DataException;


/**
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Saji Venugopalan
 * @version 1.0
 */
public interface DataSet {

  public abstract RecordSet getLookupResult(String lookupName) throws
      DataException;

  public abstract RecordSet getLookupResult(String lookupName, Map customToken) throws
      DataException;

  public abstract Map getDataSetAsKeyValue();

  public abstract ResultRow getDriverRow();

  public abstract Map getLookupResults() throws DataException;

  public String getDataSetAsXML();
}
