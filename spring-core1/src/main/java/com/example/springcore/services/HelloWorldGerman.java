package com.example.springcore.services;

public class HelloWorldGerman implements HelloWorldService {
    @Override
    public String SayHello() {
        System.out.println("German");
        return "Hello Welt";
    }
}
