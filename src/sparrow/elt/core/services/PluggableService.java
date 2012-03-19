/* Generated by Together */

package sparrow.elt.core.services;

import sparrow.elt.core.config.SparrowServiceConfig;
import sparrow.elt.core.exception.ServiceInitializationException;
import sparrow.elt.core.exception.ServiceUnavailableException;
import sparrow.elt.core.monitor.AppObserver;
import sparrow.elt.core.monitor.CycleObserver;

public interface PluggableService
    extends AppObserver, CycleObserver {

  public Object getService() throws ServiceUnavailableException;

  public Object getService(Object serviceName) throws
      ServiceUnavailableException;

}
