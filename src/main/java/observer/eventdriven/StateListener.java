package observer.eventdriven;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public class StateListener implements Listener {

    private Subject subject;

    public StateListener(Subject subject) {
        this.subject = subject;
        subject.addListener(this);
    }

    @Override
    public void onEvent(Event event) {
        Object obj = event.getSource();
        if (obj instanceof DTO) {
            DTO dto = (DTO) obj;
            System.out.println("source : old state -> " + dto.getOldState() + " new state -> " + dto.getNewState());
        }
    }
}
