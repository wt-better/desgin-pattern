package observer.eventdriven;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public class StateHolder implements Subject {

    /**
     * 触发监听器动作的实体类
     */
    private Source source;

    private List<Listener> listenerList = new ArrayList<>();

    /**
     * create new subject
     *
     * @param source
     */
    public StateHolder(Source source) {
        this.source = source;
    }

    @Override
    public synchronized void addListener(Listener listener) {
        if (listener == null) {
            throw new NullPointerException();
        }
        if (!listenerList.contains(listener)) {
            listenerList.add(listener);
        }
    }

    @Override
    public synchronized void removeListener(Listener listener) {
        listenerList.remove(listener);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void notifyListeners(Object obj) {
        List<Listener> listeners = this.listenerList;

        for (Listener listener : listeners) {
            Event event = new StateChangeEvent(obj);
            listener.onEvent(event);
        }
    }

    /**
     * 状态改变 ---> 触发通知
     */
    public void changeState(String newState) {
        String oldState = source.getState();
        source.setState(newState);
        // DTO 代表 推模型中要推送的数据
        notifyListeners(new DTO(oldState, source.getState()));
    }
}
