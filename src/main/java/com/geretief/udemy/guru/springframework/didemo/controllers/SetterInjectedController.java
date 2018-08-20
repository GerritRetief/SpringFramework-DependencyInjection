package com.geretief.udemy.guru.springframework.didemo.controllers;

import com.geretief.udemy.guru.springframework.didemo.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}