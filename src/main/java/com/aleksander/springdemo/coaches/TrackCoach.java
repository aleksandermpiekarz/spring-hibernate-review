package com.aleksander.springdemo.coaches;

import com.aleksander.springdemo.coaches.interfaces.Coach;
import com.aleksander.springdemo.helpers.services.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {

    }

    public  TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "RUN RUN";
    }

    @Override
    public String getDailyFortunes() {
        return this.fortuneService.getFortune();
    }
}