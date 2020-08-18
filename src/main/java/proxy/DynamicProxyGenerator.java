package proxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Important 具体动态代理字节码生成器
 *
 * @author wangte
 * @date created at 2018/12/2
 */
public class DynamicProxyGenerator {

    public static void main(String[] args) throws Exception {
        generateClass(EchoServiceImpl.class, "EchoServiceImplProxy");
    }

    private static void generateClass(Class<?> targetClass, String proxyName) throws Exception {
        byte[] proxyClass = ProxyGenerator.generateProxyClass(proxyName, targetClass.getInterfaces());
        String basePath = "/Users/wangte/";
        String path = basePath + proxyName + ".class";
        System.out.println(path);


        OutputStream outputStream = new FileOutputStream(path);
        outputStream.write(proxyClass);
        outputStream.close();
    }
}
