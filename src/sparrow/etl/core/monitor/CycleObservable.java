/* Generated by Together */

package sparrow.etl.core.monitor;

import java.util.ArrayList;
import java.util.Collections;

import sparrow.etl.core.log.SparrowLogger;
import sparrow.etl.core.log.SparrowrLoggerFactory;
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
public class CycleObservable {

  private ArrayList obs;

  /** Construct an Observable with zero Observers. */

  private static final SparrowLogger logger = SparrowrLoggerFactory.
      getCurrentInstance(
      CycleObservable.class);

  public CycleObservable() {
    obs = new ArrayList();
  }

  /**
   * Adds an observer to the set of observers for this object, provided
   * that it is not the same as some observer already in the set.
   * The order in which notifications will be delivered to multiple
   * observers is not specified. See the class comment.
   *
   * @param   o   an observer to be added.
   * @throws NullPointerException   if the parameter o is null.
   */
  public synchronized void addObserver(CycleObserver o) {
    if (o == null) {
      throw new NullPointerException();
    }
    if (!obs.contains(o)) {
      obs.add(o);
      Collections.sort(obs, SparrowUtil.OBJECT_PRIORITY_SORTER);
    }
  }

  /**
   * Deletes an observer from the set of observers of this object.
   *
   * @param   o   the observer to be deleted.
   */
  public synchronized void deleteObserver(CycleObserver o) {
    obs.remove(o);
    Collections.sort(obs, SparrowUtil.OBJECT_PRIORITY_SORTER);
  }

  public void notifyBeginCycle() {
    /*
     * a temporary array buffer, used as a snapshot of the state of
     * current Observers.
     */
    Object[] arrLocal;

    synchronized (this) {
      arrLocal = obs.toArray();
    }

    for (int i =0; i< arrLocal.length; i++) {
      try {
        ( (CycleObserver) arrLocal[i]).beginCycle();
      }
      catch (Exception ex) {
        ex.printStackTrace();
        logger.error(ex.getMessage());
      }
    }

  }

  public void notifyEndCycle() {
    /*
     * a temporary array buffer, used as a snapshot of the state of
     * current Observers.
     */
    Object[] arrLocal;

    synchronized (this) {
      arrLocal = obs.toArray();
    }

    for (int i =0; i< arrLocal.length; i++) {
      try {
        ( (CycleObserver) arrLocal[i]).endCycle();
      }
      catch (Exception ex) {
        ex.printStackTrace();
        logger.error(ex.getMessage());
      }
    }
  }

  /**
   * Clears the observer list so that this object no longer has any observers.
   */
  public synchronized void deleteObservers() {
    obs.clear();
  }

}
