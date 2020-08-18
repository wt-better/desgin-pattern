package template;

/**
 * @author wangte
 * @date created at 2018/4/12
 */
public class XiaoZhang extends AbstractToWork {

    @Override
    public void getUp() {
        System.out.println("小张看着被窝，恋恋不舍地起床了");
    }

    @Override
    public void wash() {
        System.out.println("小张先刷牙，继而洗脸");
    }

    @Override
    public void toCompany() {
        System.out.println("小张开着奥迪去公司");
    }
}
