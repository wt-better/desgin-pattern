package observer;

/**
 * @author wangte
 * @date created at 2018/4/18
 */
public interface Subject {

    void registerListener(Listener listener);

    void removeListener(Listener listener);

    void notifyListener();
}
