package observer.eventdriven;

/**
 * @author wangte
 * @date created at 2018/4/19
 * @desc :
 */
public interface Listener<E extends Event> {

    void onEvent(E event);
}
