package com.geretief.udemy.guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        System.out.println("In PrimaryGreetingService sayGreeting");
        return "Hello - Primary Greeting Service";
    }
}
