package com.aijieshe.web;

import com.aijieshe.config.myinterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class myconfig implements WebMvcConfigurer {

    @Autowired
    private  myinterceptor intercepetor_obj;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        String ok[]={"/*"};
        String no[]={"/login","/getlogin"};
        registry.addInterceptor(intercepetor_obj).addPathPatterns(ok).excludePathPatterns(no);

    }
}
