package com.yj.springbootdemo.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author 76355
 * @Date 2018/9/4 23:22
 * @Description  使用ServletConfig配置类 注册一个过滤器
 */
public class HeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("he Filter 您已经进入filter过滤器，您的请求正常，请继续遵守规则...");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
