package template;

/**
 * @author wangte
 * @date created at 2018/4/12
 */
public class XiaoWang extends AbstractToWork {

    @Override
    public void getUp() {
        System.out.println("小王快乐地起床了");
    }

    @Override
    public void wash() {
        System.out.println("小王先完成了洗脸，继续再刷牙");
    }

    @Override
    public void toCompany() {
        System.out.println("小王乘坐公交车去公司");
    }
}
