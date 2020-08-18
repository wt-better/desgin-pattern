package singleton;

/**
 * @author wangte
 * @date created at 2018/7/22
 */
public class Singleton {

    /**
     * 定义私有的构造器，防止外部类创建单例对象
     */
    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton SINGLETON = new Singleton();
    }

    /**
     * 暴露创建单例对象的接口
     *
     * @return 单例对象
     */
    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
