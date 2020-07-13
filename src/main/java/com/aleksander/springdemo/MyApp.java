package com.aleksander.springdemo;

import com.aleksander.springdemo.coaches.TrackCoach;
import com.aleksander.springdemo.coaches.interfaces.Coach;

public class MyApp {

    public static void main(String[] args) {

        Coach baseballCoach = new TrackCoach();

        System.out.println(baseballCoach.getDailyWorkout());
    }
}