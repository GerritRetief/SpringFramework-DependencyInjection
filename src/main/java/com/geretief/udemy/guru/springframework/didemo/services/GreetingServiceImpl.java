package com.geretief.udemy.guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello from GreetingServiceImpl";

    @Override
    public String sayGreeting() {
        System.out.println(">>>In GreetingServiceImpl.sayGreeting()");
        return HELLO_GURUS;
    }
}