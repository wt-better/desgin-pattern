package observer.event;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public class NullEvent extends AbstractEvent {

    private static final NullObject NULL_OBJECT = new NullObject();

    public NullEvent() {
        super(NULL_OBJECT);
    }
}
