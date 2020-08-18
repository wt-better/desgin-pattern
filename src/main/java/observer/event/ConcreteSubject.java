package observer.event;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public class ConcreteSubject implements Subject {

    private Source source;

    public ConcreteSubject(Source source) {
        this.source = source;
    }

    private List<Listener> listeners = new ArrayList<>();

    @Override
    public synchronized void addListener(Listener listener) {
        if (listener == null) {
            throw new NullPointerException();
        }
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    @Override
    public synchronized void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void notifyListeners() {
        for (Listener listener : listeners) {
            AbstractEvent event = new NullEvent();
            if (getSource() != null) {
                event = new SourceChangeEvent(this.source);
            }

            // this event is AbstractEvent
            listener.onEvent(event);
        }
    }

    /**
     * 改变状态，触发通知
     *
     * @param source
     */
    public void changeState(Source source) {
        this.source = source;
        notifyListeners();
    }

    public Source getSource() {
        return source;
    }
}
