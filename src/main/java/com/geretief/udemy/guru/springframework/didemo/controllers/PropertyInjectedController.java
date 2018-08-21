package com.geretief.udemy.guru.springframework.didemo.controllers;

import com.geretief.udemy.guru.springframework.didemo.services.GreetingService;
import com.geretief.udemy.guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        System.out.println(">>>In PropertyInjectedController.sayHello()");
        return greetingServiceImpl.sayGreeting();
    }

}