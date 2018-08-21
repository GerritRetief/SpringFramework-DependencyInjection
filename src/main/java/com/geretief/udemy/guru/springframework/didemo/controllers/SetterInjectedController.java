package com.geretief.udemy.guru.springframework.didemo.controllers;

import com.geretief.udemy.guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        System.out.println(">>>In SetterInjectedController.sayHello()");
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService) {
        System.out.println(">>>In SetterInjectedController.setGreetingService()");
        this.greetingService = greetingService;
    }
}