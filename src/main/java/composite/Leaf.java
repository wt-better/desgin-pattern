package composite;

import java.util.List;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/5/5
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public String componentType() {
        return "leaf";
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Component component) {
        return false;
    }

    @Override
    public List<Component> getChild() {
        throw new UnsupportedOperationException();
    }
}
