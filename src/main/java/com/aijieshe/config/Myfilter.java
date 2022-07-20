package com.aijieshe.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

//@WebFilter(urlPatterns = "*",filterName = "firstfileter")
public class Myfilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest)servletRequest;
        HttpServletResponseWrapper httpResponse = new HttpServletResponseWrapper((HttpServletResponse) servletResponse);
        System.out.println(httpRequest.getRequestURI());
        String path=httpRequest.getRequestURI();
        if(path.indexOf("/api/")<0){
            path="/api"+path;
            System.out.println(path);
            httpRequest.getRequestDispatcher(path).forward(httpRequest,httpResponse);
        }
        else {
            filterChain.doFilter(servletRequest,servletResponse);

        }
        System.out.println("w");



    }
}
