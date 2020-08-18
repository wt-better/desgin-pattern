package observer.event;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public interface Listener<E extends AbstractEvent> {

    /**
     * Handle an event
     *
     * @param event the event to respond to
     */
    void onEvent(E event);
}
