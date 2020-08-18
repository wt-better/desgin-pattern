package command.commandpattern;

/**
 * @author wangte
 * @date created at 2018/1/19
 * @desc :
 */
public class Client {

    public static void main(String[] args) {
        /** 创建接收对象 **/
        Light light = new Light();
        /** 创建命令对象 **/
        Command command = new LightOnCommand(light);

        RemoteController remoteController = new RemoteController(command);
        remoteController.buttonPressed();
    }
}
