package composite;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/5/5
 */
public class Main {

    public static void main(String[] args) {
        Component rootContainer = new Composite("c://");
        Leaf leaf1 = new Leaf("leaf1");
        rootContainer.add(leaf1);
        rootContainer.add(new Leaf("leaf2"));

        Component subContainer = new Composite("study/");
        subContainer.add(new Leaf("leaf3"));
        subContainer.add(new Leaf("leaf4"));

        rootContainer.add(subContainer);

        rootContainer.display();
    }
}
