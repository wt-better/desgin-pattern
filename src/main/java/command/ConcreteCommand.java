package command;

/**
 * @author WangTe
 * @date Created At 2018/1/18
 * @desc : 具体的命令，实现要执行的方法，它通常是“虚”的实现；通常会有接收者，并调用接收者的功能来完成命令要执行的操作
 */
public class ConcreteCommand implements Command{

    /** 命令接收者 **/
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        /** 由接收者执行命令要完成的动作 **/
        receiver.action();
    }
}
