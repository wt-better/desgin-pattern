package observer.event;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public class SourceChangeEvent extends AbstractEvent {

    public SourceChangeEvent(Object source) {
        super(source);
    }
}
