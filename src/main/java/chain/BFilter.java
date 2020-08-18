package chain;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/4/27
 */
public class BFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        System.out.println("b filter handler...");
        filterChain.doFilter(request, response);
    }
}
