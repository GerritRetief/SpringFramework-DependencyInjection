package com.geretief.udemy.guru.springframework.didemo.controllers;

import com.geretief.udemy.guru.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}