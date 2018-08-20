package com.geretief.udemy.guru.springframework.didemo;

import com.geretief.udemy.guru.springframework.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        //Get a reference of the bean without saying new MyController
        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();
    }
}
