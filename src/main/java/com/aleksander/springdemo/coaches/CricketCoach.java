package com.aleksander.springdemo.coaches;

import com.aleksander.springdemo.coaches.interfaces.Coach;
import com.aleksander.springdemo.helpers.services.HappyFortuneService;

public class CricketCoach implements Coach {

    private HappyFortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Cricket even more!";
    }

    @Override
    public String getDailyFortunes() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(HappyFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}