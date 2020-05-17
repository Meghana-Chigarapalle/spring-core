package com.example.springcore.services;

public class HelloWorldRussian implements HelloWorldService{
    @Override
    public String SayHello() {
        System.out.println("Russian");
        return "Привет мир";
    }
}
