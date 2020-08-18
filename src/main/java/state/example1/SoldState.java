package state.example1;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/4/25
 */
public class SoldState implements State {

    private StateMachine stateMachine;

    public SoldState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertCoin() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }

}
