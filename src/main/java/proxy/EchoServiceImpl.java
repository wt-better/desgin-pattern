package proxy;

/**
 * @author wangte
 * @date created at 2018/1/23
 * @desc :
 */
public class EchoServiceImpl implements EchoService {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
