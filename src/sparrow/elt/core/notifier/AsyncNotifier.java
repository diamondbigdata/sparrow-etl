package sparrow.elt.core.notifier;

import sparrow.elt.core.config.SparrowEventConfig;
import sparrow.elt.core.config.SparrowNotifierConfig;
import sparrow.elt.core.exception.NotifierException;
import sparrow.elt.core.notifier.event.Event;
import sparrow.elt.core.util.AsyncRequestProcessor;
import sparrow.elt.core.util.RequestListener;

/**
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */
public abstract class AsyncNotifier
    implements Notifier, RequestListener {

  protected static AsyncRequestProcessor arp = null;
  private final String type;
  protected final SparrowNotifierConfig config;

  /**
   *
   * @param type String
   */
  public AsyncNotifier(SparrowNotifierConfig config) {
    this.type = config.getType();
    arp = AsyncRequestProcessor.createAsynchProcessor(type);
    arp.registerListener(type, this);
    this.config = config;
  }

  /**
   *
   * @param o Object
   * @throws Exception
   */
  public void process(Object o) throws Exception {
    processEvent( (Event) o);
  }

  /**
   *
   */
  public void endProcess() {
    arp.close();
  }

  /**
   *
   * @param event Event
   * @throws Exception
   */
  public abstract void processEvent(Event event) throws Exception;

  /**
   *
   * @param event Event
   * @throws NotifierException
   */
  /**
  * sendNotification
  *
  * @param event Event
  */
 public void sendNotification(Event event) {
   arp.process(type, event);
 }


}
