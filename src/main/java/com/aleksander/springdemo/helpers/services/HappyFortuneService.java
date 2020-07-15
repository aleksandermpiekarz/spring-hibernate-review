package com.aleksander.springdemo.helpers.services;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return  "You are so cool!";
    }
}