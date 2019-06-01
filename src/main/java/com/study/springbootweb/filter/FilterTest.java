package com.study.springbootweb.filter;

import javax.servlet.*;
import java.io.IOException;

public class FilterTest implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter处理");
        filterChain.doFilter(servletRequest, servletResponse);
    }

}
