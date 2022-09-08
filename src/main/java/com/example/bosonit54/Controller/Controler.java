package com.example.bosonit54.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Controler {

    @Value("${greeting}")
    private String message1;
    @Value("${my.number}")
    private String message2;

    @Bean("firstMessage")
    public String getMessage1(){
        return message1;
    }

    @Bean("secondMessage")
    public String getMessage2(){
        return message2;
    }
}
