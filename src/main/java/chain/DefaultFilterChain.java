package chain;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/4/27
 */
public class DefaultFilterChain implements FilterChain {

    private List<Filter> filterList = new CopyOnWriteArrayList<>();

    private int currentFilterIndex;

    public DefaultFilterChain() {
    }

    public DefaultFilterChain(List<Filter> filterList) {
        this.filterList = filterList;
    }

    @Override
    public void doFilter(Request request, Response response) {
        if (currentFilterIndex == filterList.size()) {
            return;
        }

        Filter filter = filterList.get(currentFilterIndex);
        currentFilterIndex++;

        filter.doFilter(request, response, this);
    }

    @Override
    public void removeFilter(int index) {
        filterList.remove(index);
    }

    @Override
    public void removeFilter(Filter filter) {
        filterList.remove(filter);
    }

    @Override
    public void addFilter(Filter filter) {
        if (!filterList.contains(filter)) {
            filterList.add(filter);
        }
    }

}
