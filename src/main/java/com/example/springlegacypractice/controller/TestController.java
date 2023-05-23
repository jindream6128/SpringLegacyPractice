package com.example.springlegacypractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/home")
    public String Hello(Model model){
        model.addAttribute("data","hello!");
        System.out.println("test"); // test
        return "home";
    }
}
