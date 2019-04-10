package com.example.demo.component;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录检查，拦截器
 */
public class LoginHandlerInterceper implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        if(user == null){//未登录
            request.setAttribute("msg","没有权限，请登录");
            request.getRequestDispatcher("login.html").forward(request,response);
            return false;
        }else{//以登录
            return true;
        }
    }

}
