package observer;

/**
 * @author wangte
 * @date created at 2018/4/18
 */
public class ConcreteListener implements Listener {

    private String msg;

    private Subject subject;

    public ConcreteListener(Subject subject) {
        this.subject = subject;
        subject.registerListener(this);
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        display();
    }

    public void display() {
        System.out.println("MSG = " + msg);
    }
}
