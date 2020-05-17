package com.example.springcore.config;

import com.example.springcore.services.HelloWorldFactory;
import com.example.springcore.services.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorldFactory HelloWorldConfig(){
        return new HelloWorldFactory();
    }
    @Bean
    @Profile("english")
    public HelloWorldService HelloWorldEnglishConfig(){
        return new HelloWorldFactory().createService("eng");
    }
    @Bean
    @Profile("spanish")
    public HelloWorldService HelloWorldSpanishConfig(){
        return new HelloWorldFactory().createService("span");
    }
    @Bean
    @Primary
    public HelloWorldService HelloWorldFrenchConfig(){
        return new HelloWorldFactory().createService("fren");
    }
    @Bean
    //@Primary
    public HelloWorldService HelloWorldGermanConfig(){
        return new HelloWorldFactory().createService("germ");
    }
    @Bean
    //@Primary
    public HelloWorldService HelloWorldPolishConfig(){
        return new HelloWorldFactory().createService("poli");
    }
    @Bean
    //@Primary
    public HelloWorldService HelloWorldRussianConfig(){
        return new HelloWorldFactory().createService("russ");
    }
}
