package observer.eventdriven;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public abstract class AbstractEvent implements Event {

    private Object source;

    private final long timestamp;

    public AbstractEvent(Object source) {
        this.source = source;
        timestamp = System.currentTimeMillis();
    }

    @Override
    public Object getSource() {
        return source;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
