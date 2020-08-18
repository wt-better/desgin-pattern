package observer.eventdriven;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public class DTO {

    private String oldState;

    private String newState;

    public DTO(String oldState, String newState) {
        this.oldState = oldState;
        this.newState = newState;
    }

    public String getOldState() {
        return oldState;
    }

    public void setOldState(String oldState) {
        this.oldState = oldState;
    }

    public String getNewState() {
        return newState;
    }

    public void setNewState(String newState) {
        this.newState = newState;
    }
}
