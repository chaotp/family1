package com.ctp.family.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * ClassName:16338
 * package:com.ctp.springbootdemo.config
 * Description:TODO
 *
 * @date:2020/1/6 - 15:21
 * @Author:chaotianpeng
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-----MyFilter的doFilter方法-----");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("-----MyFilter的init方法-----");
    }

    @Override
    public void destroy() {
        System.out.println("-----MyFilter的destroy方法-----");
    }
}
