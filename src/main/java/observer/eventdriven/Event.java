package observer.eventdriven;

/**
 * @author wangte
 * @date created at 2018/4/19
 * @desc :
 */
public interface Event<T> {

    T getSource();
}
