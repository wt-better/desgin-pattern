package chain;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/4/27
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain filterChain);
}
