package sparrow.elt.core.extractor;

import sparrow.elt.core.exception.DataException;
import sparrow.elt.core.vo.DataHolder;


/**
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Saji Venugopalan
 * @version 1.0
 */
public interface DataExtractor {

  public abstract void initialize();

  public abstract DataHolder loadData() throws DataException;

  public abstract void destroy() throws DataException;

}
