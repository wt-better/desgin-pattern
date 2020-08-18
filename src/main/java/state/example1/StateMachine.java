package state.example1;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/4/25
 */
public class StateMachine {

    private State currentState;

    public void chanageState(State nextState) {
        currentState = nextState;
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void turnCrank() {
        currentState.turnCrank();
    }

    public void dispense() {
        currentState.dispense();
    }

    /**
     * 状态转变
     *
     * @param targetState 目标状态
     */
    void changeState(State targetState) {
        currentState = targetState;
    }
}
