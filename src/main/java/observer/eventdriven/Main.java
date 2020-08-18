package observer.eventdriven;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public class Main {

    public static void main(String[] args) {
        StateHolder stateHolder = new StateHolder(new Source("1"));
        new StateListener(stateHolder);

        stateHolder.changeState("3");
        stateHolder.changeState("4");
    }
}
