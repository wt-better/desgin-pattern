package observer.event;

/**
 * @author wangte
 * @date created at 2018/4/19
 * <p>
 * Which is abstract class about generic event;
 * Class to be extends by all generic event.
 */
public abstract class AbstractEvent extends EventObject {

    /**
     * System time when the event happened
     **/
    private final long timestamp;

    /**
     * Create new Event
     *
     * @param source
     */
    public AbstractEvent(Object source) {
        super(source);
        this.timestamp = System.currentTimeMillis();
    }

    /**
     * Return the system time in milliseconds when the event happened
     *
     * @return system time in long
     */
    public final long getTimestamp() {
        return timestamp;
    }
}
