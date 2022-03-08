package com.shida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    /**
     * 功能描述: 跳转到登录页
     *
     * @return java.lang.String
     */
    @RequestMapping("/goLogin")
    public String goLogin() {
        return "login";
    }

    /**
     * 功能描述: 登录页
     *
     * @return java.lang.String
     */
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String psd) {
        // session记录用户信息
        session.setAttribute("user", username);
        return "success";
    }

    /**
     * 功能描述: 登录成功页
     *
     * @return java.lang.String
     */
    @RequestMapping("/success")
    public String goSuccess() {
        return "success";
    }

}