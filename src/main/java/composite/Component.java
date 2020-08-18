package composite;

import java.util.List;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/5/5
 */
public interface Component {

    /**
     * Return component Name
     *
     * @return component Name
     */
    String getName();

    /**
     * Return component Type
     *
     * @return component Type
     */
    String componentType();

    /**
     * add component to target component
     * this method should be use container component
     * if used to Leaf component,will throw UnsupportedOperationException
     *
     * @param component component
     */
    void add(Component component);

    /**
     * remove component from target component
     *
     * @param component component which to be removed
     * @return true if remove success,otherwise return false
     */
    boolean remove(Component component);

    /**
     * Return component`s child component
     *
     * @return child component  list
     */
    List<Component> getChild();

    /**
     * display as a tree
     */
    void display();
}
