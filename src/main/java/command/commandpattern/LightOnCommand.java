package command.commandpattern;

/**
 * @author wangte
 * @date created at 2018/1/19
 * @desc : 打开电灯的命令对象
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * 这个execute方法调用接受对象的onAction方法
     */
    @Override
    public void execute() {
        light.onAction();
    }
}
