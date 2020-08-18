package observer.event;

/**
 * @author wangte
 * @date created at 2018/4/19
 */
public class ConcreteListener implements Listener<SourceChangeEvent> {

    private Subject subject;

    public ConcreteListener(Subject subject) {
        this.subject = subject;
        subject.addListener(this);
    }

    @Override
    public void onEvent(SourceChangeEvent event) {
        Object obj = event.getSource();
        if (obj instanceof Source) {
            Source source = (Source) obj;
            System.out.println(this.getClass().getName() + "  source -> username " + source.getUserName());
        }
    }
}
