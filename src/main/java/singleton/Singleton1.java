package singleton;

import java.io.Serializable;

/**
 * @author wangte
 * @date created at 2018/7/22
 */
public class Singleton1 implements Serializable {

    private static volatile Singleton1 singleton1;

    private static final Object LOCK = new Object();

    /**
     * 定义私有的构造器，防止外部类创建单例对象
     */
    private Singleton1() {
        //throw new RuntimeException("非法访问私有构造器");
    }

    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            synchronized (LOCK) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }

    /**
     * 防止反序列化创建单例对象
     */
    private Object readResolve() {
        return singleton1;
    }
}
