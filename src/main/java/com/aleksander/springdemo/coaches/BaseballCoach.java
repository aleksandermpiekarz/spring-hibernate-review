package com.aleksander.springdemo.coaches;

import com.aleksander.springdemo.coaches.interfaces.Coach;
import com.aleksander.springdemo.helpers.services.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 20 minutes kicking ball";
    }

    @Override
    public String getDailyFortunes() {
        return fortuneService.getFortune();
    }
}