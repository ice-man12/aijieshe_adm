package com.aijieshe.controller;


import com.aijieshe.pojo.administrator;
import com.aijieshe.service.administrator_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.io.IOException;


@Controller
public class login_controller {

    @Autowired
    private administrator_service impl;

    @RequestMapping("/")
    public String first(HttpServletRequest request){
        administrator adm= (administrator) request.getSession().getAttribute("administrator");
        request.setAttribute("adm",adm);
        return "index";
    }
    @RequestMapping("/get/{path}")
    public String get(@PathVariable("path") String path){
        String pt=path;
        return pt;
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/getlogin")
    public String getlogin(String id, String pwd, String yes,HttpServletRequest request, ModelMap map, HttpServletResponse response) throws IOException {

        administrator adm=impl.check(id.trim(),pwd.trim());
        if(adm!=null) {
            System.out.println(yes);
            if(yes.equals("1"))
            {
                System.out.println("jia");
                Cookie cookie1=new Cookie("password",adm.getPassword());
                Cookie cookie2=new Cookie("id",adm.getId());
                cookie1.setPath(request.getContextPath());
                cookie1.setMaxAge(60*60*24*5);
                cookie2.setPath(request.getContextPath());
                cookie2.setMaxAge(60*60*24*5);
                response.addCookie(cookie1);
                response.addCookie(cookie2);
            }
            request.getSession().setAttribute("administrator", adm);
            response.sendRedirect("index");
        }
        map.addAttribute("title","密码错误或者id错误");
        return "login";
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request){
        administrator adm= (administrator) request.getSession().getAttribute("administrator");
        request.setAttribute("adm",adm);
        return "index";
    }

    @RequestMapping("/loginout")
    public String loginout(HttpServletRequest request,HttpServletResponse response){
        Cookie[] cookies =request.getCookies();
        if(cookies!=null) {

            for (Cookie cookie : cookies) {

                if (cookie.getName().equals("password")) {
                    System.out.println("yiqc");
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                } else if (cookie.getName().equals("id")) {
                    System.out.println("yiqc");
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
            }

        }
        request.getSession().removeAttribute("adm");
        HttpSession session=request.getSession();
        if (session!=null)
            session.invalidate();
        try {
            response.sendRedirect("/aijieshe/login");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "login";
    }

}
