package observer.eventdriven;

/**
 * @author wangte
 * @date created at 2018/4/19
 *
 * 状态改变事件
 */
public class StateChangeEvent extends AbstractEvent {

    public StateChangeEvent(Object source) {
        super(source);
    }
}
