package chain;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/4/27
 */
public class Main {

    public static void main(String[] args) {
        //定义默认的责任链
        FilterChain filterChain = new DefaultFilterChain();
        filterChain.addFilter(new AFilter());
        filterChain.addFilter(new BFilter());

        // do filter
        filterChain.doFilter(new Request(), new Response());
        System.out.println("1");
    }
}
