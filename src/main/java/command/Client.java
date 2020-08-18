package command;

/**
 * @author WangTe
 * @date Created At 2018/1/18
 * @desc : Client 类
 */
public class Client {

    public static void main(String[] args) {
        /** 创建命令的接收者 receiver **/
        Receiver receiver = new Receiver();

        /** 创建具体的命令 **/
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);
        invoker.executeCommand();
    }
}
