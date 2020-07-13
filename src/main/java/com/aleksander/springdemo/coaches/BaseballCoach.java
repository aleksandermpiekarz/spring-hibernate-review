package com.aleksander.springdemo.coaches;

import com.aleksander.springdemo.coaches.interfaces.Coach;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 20 minutes kicking ball";
    }
}
