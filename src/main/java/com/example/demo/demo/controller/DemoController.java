package com.example.demo.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.demo.domain.Login;
import com.example.demo.demo.service.DemoService;

@Controller
public class DemoController {
 
    @Autowired
    private DemoService service;
 
    @GetMapping("/")
    public String api()
    {
 
        return "index";
    }
 
    @PostMapping("/log")
    public String login(@ModelAttribute("user") Login user) {
 
        Login oauthUser = service.log(user.getUsername(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/disp";
        } else {
            return "redirect:/";
        }
    }
 
    @GetMapping("/disp")
    public String display() {
        return "disp";
    }
}