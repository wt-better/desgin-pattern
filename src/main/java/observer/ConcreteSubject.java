package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangte
 * @date created at 2018/4/18
 */
public class ConcreteSubject implements Subject {

    private String msg = "Hello World!";

    private List<Listener> listeners = new ArrayList<>();

    public List<Listener> getListeners() {
        return listeners;
    }

    @Override
    public void registerListener(Listener listener) {
        listeners.add(listener);
    }

    public void setMsg(String msg){
        this.msg = msg;
        notifyListener();
    }

    @Override
    public void notifyListener() {
        for (Listener listener : listeners) {
            listener.update(this.msg);
        }
    }

    @Override
    public void removeListener(Listener listener) {
        if (listeners != null) {
            listeners.remove(listener);
        }
    }
}
