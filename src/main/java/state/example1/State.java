package state.example1;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/4/25
 */
public interface State {

    /**
     * 插入硬币
     */
    void insertCoin();

    /**
     * 转动手柄
     */
    void turnCrank();

    /**
     * 吐出糖果
     */
    void dispense();
}
