package com.shida.controller;
import com.shida.entity.User;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/HelloController")
public class HelloController {

    @RequestMapping("/hello")
    public String SayHello(Model model){
        model.addAttribute("msg", "HelloController");
        model.addAttribute("title", "this is a controller");

        return "hello";
    }

    /**
     * 提交参数一样
     * @param name
     * @return
     */
    @RequestMapping("/test")
    public String test(String name){
        System.out.println(name);

        return "hello";
    }


    /**
     * 提交参数不一样
     * @param name
     * @return
     */
    @RequestMapping("/test1")
    public String test1(@RequestParam("username") String name){
        System.out.println(name);
        return "hello";
    }


    /**
     *
     * 通过对象传递参数
     * @param user
     * @return
     */
    @RequestMapping("/test2")
    public String test2(User user){
        System.out.println(user);
        return "hello";
    }





    @PostMapping("/encodeing")
    public String encodeing(Model model,String name) {
        System.out.println(name);
        model.addAttribute("msg",name); //获取表单提交的值
        return "test"; //跳转到test页面显示输入的值
    }


    /**
     * 功能描述: 注销登录
     *
     * @return java.lang.String
     * @author jiaoqianjin
     * @date 2021/3/21
     */
    @RequestMapping("/goOut")
    public String goOut(HttpSession session) {
        session.removeAttribute("user");
        return "login";
    }



}
