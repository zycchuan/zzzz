package com.zyc.controller;


import com.zyc.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
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
    }

}
