package com.aijieshe.config;

import com.aijieshe.dao.administrator_dao;
import com.aijieshe.pojo.administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;


import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class myinterceptor implements HandlerInterceptor {

    @Autowired
    private administrator_dao adm_dao;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        administrator adm = (administrator) request.getSession().getAttribute("administrator");

        if (adm != null){
            return  true;
        }
        Cookie[] cookies =request.getCookies();
        if(cookies!=null)
        {

            String password=null;
            String id=null;
            for(Cookie cookie:cookies)
            {

                if (cookie.getName().equals("password"))
                {
                    password=cookie.getValue();

                }else if(cookie.getName().equals("id"))
                {
                    id=cookie.getValue();

                }
            }
            if(password!=null&&id!=null)
            {
               administrator adm1= adm_dao.check(id,password);

               if(adm1.getPassword().equals(password)&&adm1.getId().equals(id))
               {
                   request.getSession().setAttribute("administrator",adm1);
                   return true;
               }
            }
        }



        response.sendRedirect("/aijieshe/login");
        return false;



    }
}
