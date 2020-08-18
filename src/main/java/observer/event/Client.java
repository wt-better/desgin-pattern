package observer.event;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject(new Source("lisa","123456"));

        Listener<SourceChangeEvent>  listener = new ConcreteListener(subject);
        //subject.addListener(listener);

        subject.changeState(new Source("jack","123456"));
        subject.changeState(new Source("lisa","123456"));
    }
}
