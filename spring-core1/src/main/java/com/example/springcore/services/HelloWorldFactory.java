package com.example.springcore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldFactory {
public HelloWorldService createService(String lang){
        HelloWorldService service=null;
        switch (lang){
            case "eng": service=new HelloWorldEnglish();
            break;
            case "span": service=new HelloWorldSpanish();
            break;
            case "fren": service=new HelloWorldFrench();
            break;
            case "germ": service=new HelloWorldGerman();
            break;
            case "poli": service=new HelloWorldPolish();
            break;
            case "russ":service=new HelloWorldRussian();
            break;
            default: new HelloWorldEnglish();
        }
        return service;
    }

}
