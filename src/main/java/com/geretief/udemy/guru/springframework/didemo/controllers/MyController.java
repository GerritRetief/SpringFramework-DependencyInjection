package com.geretief.udemy.guru.springframework.didemo.controllers;

import com.geretief.udemy.guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    /*public MyController(){
        System.out.println(">>>In MyController's Constructor");
    }*/

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
        System.out.println(">>>In MyController's Constructor");
    }

    public String hello(){
        System.out.println(">>>In MyController.hello()");
        System.out.println("Hello from MyController");
        return greetingService.sayGreeting();
    }
}
