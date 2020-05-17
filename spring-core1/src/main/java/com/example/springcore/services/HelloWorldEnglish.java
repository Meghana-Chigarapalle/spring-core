package com.example.springcore.services;

public class HelloWorldEnglish implements HelloWorldService{
    @Override
    public String SayHello() {
        String message="Hello World";
        System.out.println(message);
        return message;
    }
}
