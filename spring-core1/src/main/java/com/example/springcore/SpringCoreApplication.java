package com.example.springcore;

import com.example.springcore.controllers.GreetingController;
import com.example.springcore.services.HelloWorldService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {

        ApplicationContext ctx =SpringApplication.run(SpringCoreApplication.class, args);
        GreetingController controller=(GreetingController) ctx.getBean("greetingController");
        controller.getHelloWorldService();
    }

}
