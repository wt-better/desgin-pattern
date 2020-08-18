package observer.eventdriven;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public class Source {

    private String state;

    public Source(String newState) {
        this.state = newState;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
