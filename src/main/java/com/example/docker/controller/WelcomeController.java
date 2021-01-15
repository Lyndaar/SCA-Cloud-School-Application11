package com.example.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public String WelcomeSCA(){
        return "Welcome to SCA Cloud School Application, this is my first assessment.";
    }
}
