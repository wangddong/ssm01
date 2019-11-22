package com.huidian.controller;

import com.huidian.domain.User;
import com.huidian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

;import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public String getAllUser(){
        List<User> list=userService.getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return "success";
    }

    @RequestMapping("/getNewUser")
    public String getNewUser(){
        List<User> list=userService.getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return "success";
    }

    @RequestMapping("/getNewUser2")
    public String getNewUser2(){
        List<User> list=userService.getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return "success";
    }

	 @RequestMapping("/getNewUser1")
    public String getNewUser1(){
        List<User> list=userService.getAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return "success";
    }
}
