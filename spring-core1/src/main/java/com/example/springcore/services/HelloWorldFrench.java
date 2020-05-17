package com.example.springcore.services;

public class HelloWorldFrench implements HelloWorldService{
    @Override
    public String SayHello() {
        System.out.println("french");
        return "Bonjour le monde";
    }
}
