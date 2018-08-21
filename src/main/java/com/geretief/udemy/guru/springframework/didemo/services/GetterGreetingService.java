package com.geretief.udemy.guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        System.out.println("In GetterGreetingService.sayGreeting()");
        return "Hello from GetterGreetingService";
    }
}