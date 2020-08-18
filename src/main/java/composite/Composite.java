package composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/5/5
 */
public class Composite implements Component {

    private String name;

    private List<Component> childComponentList;

    public Composite(String name) {
        this.name = name;
        childComponentList = new LinkedList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String componentType() {
        return "container";
    }

    @Override
    public void add(Component component) {
        addIfAbsent(component);
    }

    @Override
    public boolean remove(Component component) {
        return childComponentList.remove(component);
    }

    @Override
    public void display() {
        System.out.println(getName());
        List<Component> childComponentList = getChild();
        if (childComponentList.isEmpty()) {
            return;
        }

        for (Component component : childComponentList) {
            component.display();
        }
    }

    @Override
    public List<Component> getChild() {
        return childComponentList;
    }

    private void addIfAbsent(Component component) {
        if (childComponentList.contains(component)) {
            return;
        }

        childComponentList.add(component);
    }
}
