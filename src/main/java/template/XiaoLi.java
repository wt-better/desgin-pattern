package template;

/**
 * @author wangte
 * @date created at 2018/4/12
 */
public class XiaoLi extends AbstractToWork {

    @Override
    protected void getUp() {
        System.out.println("小李起床了");
    }

    @Override
    protected void wash() {
        System.out.println("小李洗漱");
    }

    @Override
    protected void toCompany() {
        System.out.println("小李叫了个滴滴去了公司");
    }

    @Override
    protected boolean isDelay() {
        System.out.println("小李起床迟了，连脸都没洗，风风火火出去了");
        return true;
    }
}
