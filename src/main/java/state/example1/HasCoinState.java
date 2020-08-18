package state.example1;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/4/25
 */
public class HasCoinState implements State {

    private StateMachine stateMachine;

    public HasCoinState(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertCoin() {

    }


    @Override
    public void turnCrank() {
        stateMachine.changeState(new SoldState(stateMachine));
    }

    @Override
    public void dispense() {

    }
}
