package com.example.springcore.services;

public class HelloWorldPolish implements HelloWorldService{
    @Override
    public String SayHello() {
        System.out.println("Polish");
        return "Witaj świecie";
    }
}
