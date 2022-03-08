package com.shida.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getRequestURI());
        // 如果已经在登录页，放行
        if (request.getRequestURI().contains("login")) {
            return true;
        }
        // 如果session存在用户信息，放行
        if (request.getSession().getAttribute("user")!=null) {
            return true;
        }
        // 否则，用户未登录，跳转到登录页面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}