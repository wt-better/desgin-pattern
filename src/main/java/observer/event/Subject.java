package observer.event;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public interface Subject {

    void addListener(Listener listener);

    void removeListener(Listener listener);

    void notifyListeners();
}
