package chain;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/4/27
 */
public interface FilterChain {

    /**
     * Causes the next filter in the chain to be invoked, or if the calling filter is the last filter
     * in the chain, causes the resource at the end of the chain to be invoked.
     *
     * @param request  request
     * @param response response
     */
    void doFilter(Request request, Response response);

    /**
     * add Filter in the filter chain
     *
     * @param filter filter
     */
    void addFilter(Filter filter);

    void removeFilter(int index);

    void removeFilter(Filter filter);
}
