package com.aleksander.springdemo.helpers.services;

public class HappyFortuneInterface implements FortuneService {

    @Override
    public String getFortune() {
        return  "You are so cool!";
    }
}