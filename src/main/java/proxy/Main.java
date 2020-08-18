package proxy;

/**
 * @author wangte
 * @date created at 2018/1/23
 * @desc :
 */
public class Main {

    public static void main(String[] args) {
        EchoService echoService = new EchoServiceImpl();

        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(echoService);

        ((EchoService) proxyInvocationHandler.getProxy()).sayHello("kelvin");
    }
}
