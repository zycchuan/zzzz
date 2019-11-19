package com.zyc.controller;


import com.zyc.bean.User;
import com.zyc.mapper.UserMapper;
import com.zyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("test")
public class TestController {

    @Resource
    private UserService userService;
    /*@Autowired
    private User user;


    @RequestMapping("testFm")
    public String testFm(Model model){
        model.addAttribute("user",user);
        System.out.println(123);
        return "fm/fmIndex";
    }
    @RequestMapping("testTh")
    public String testTh(Model model){
        model.addAttribute("user",user);
        return "th/thIndex";
    }*/
    @RequestMapping("testInert")
    @ResponseBody
    public Object testInert(){
        User user = new User();
        user.setName("zyc");
        userService.add(user);
        System.out.println(user);
        return user;

    }

    @RequestMapping("testSelect")
    @ResponseBody
    public Object testSelect(Integer id){
        return userService.selectAll(id);

    }

}
