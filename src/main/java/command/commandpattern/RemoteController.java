package command.commandpattern;

/**
 * @author wangte
 * @date created at 2018/1/19
 * @desc : 远程控制类，即遥控器，相当于命令模式中的 Invoker
 */
public class RemoteController {

    private Command slot;

    public RemoteController(Command command) {
        this.slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }
}
