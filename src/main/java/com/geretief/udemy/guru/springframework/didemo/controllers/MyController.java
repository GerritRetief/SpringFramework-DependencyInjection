package com.geretief.udemy.guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public MyController(){
        System.out.println(">>>In MyController's Constructor");
    }

    public String hello(){
        System.out.println(">>>In MyController.hello()");
        System.out.println("Hello from MyController");
        return "foo";
    }
}
