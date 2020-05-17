package com.example.springcore.services;

public class HelloWorldSpanish implements HelloWorldService{
    @Override
    public String SayHello() {
        System.out.println("Hola Mundo");
        return "Hola Mundo";
    }
}
