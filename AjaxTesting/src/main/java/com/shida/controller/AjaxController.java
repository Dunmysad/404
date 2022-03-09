package com.shida.controller;

import com.shida.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class AjaxController {

    @RequestMapping("/test")
    public void test(String name, HttpServletResponse response) throws IOException {
        if ("test".equals(name)){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }
    @RequestMapping("/test2")
    @ResponseBody
    public List<User> test2(){
        List<User> users = new ArrayList<User>();
        users.add(new User("张三",1,"男"));
        users.add(new User("李四",1,"男"));
        users.add(new User("王五",1,"男"));
        return users;
    }

    @RequestMapping("/test3")
    public String test3(){

        return "test";
    }
}
