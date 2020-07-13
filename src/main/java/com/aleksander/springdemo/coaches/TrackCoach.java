package com.aleksander.springdemo.coaches;

import com.aleksander.springdemo.coaches.interfaces.Coach;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "RUN RUN";
    }
}