package template;

/**
 * @author wangte
 * @date created at 2018/4/12
 */
public abstract class AbstractToWork {

    /**
     * 起床
     */
    protected abstract void getUp();

    /**
     * 洗漱
     */
    protected abstract void wash();

    /**
     * 乘坐相应的交通工具去公司
     */
    protected abstract void toCompany();

    /**
     * 早上起来去工作（模板方法）
     **/
    public final void toWork() {
        //首先起床
        getUp();

        if (!isDelay()) {
            //起床之后洗漱
            wash();
        }

        //然后去公司
        toCompany();
    }

    protected boolean isDelay() {
        return false;
    }
}
