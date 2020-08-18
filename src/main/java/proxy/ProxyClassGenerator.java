package proxy;

import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Objects;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/4/27
 */
public class ProxyClassGenerator {

    /**
     * 生成JDK代理-Class文件
     */
    public static void main(String[] args) throws IOException {
        String proxyName = "EchoProxy";

        Class[] interfaces = new Class[]{EchoService.class};
        int accessFlags = Modifier.PUBLIC | Modifier.FINAL;

//        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
//                proxyName, interfaces, accessFlags);


        /**
         * 如果name为"/"，则获取当前classPath路径
         * 如果name为"."或者""，则获取当前包路径
         * 如果name为其他，则在当前包下寻找该resource
         *
         * 具体逻辑在：resolveName中
         */
        System.out.println(ProxyClassGenerator.class.getResource("").getPath());
        System.out.println(ProxyClassGenerator.class.getResource(".").getPath());
        //以下是获取当前classPath的路径
        System.out.println(ProxyClassGenerator.class.getResource("/").getPath());

        /**
         * class的getResource最终会路由到ClassLoader的getResource上
         */
        System.out.println(Objects.requireNonNull(ProxyClassGenerator.class.getClassLoader().getResource("")).getPath());


//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + proxyName + ".class"));
//
//        bos.write(proxyClassFile);
//
//        bos.close();
    }
}
