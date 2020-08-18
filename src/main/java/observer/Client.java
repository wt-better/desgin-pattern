package observer;

/**
 * @author wangte
 * @date created at 2018/4/18
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteListener listener = new ConcreteListener(subject);

        subject.setMsg("Hello EveryBody!");

    }
}
