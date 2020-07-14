package com.aleksander.springdemo;

import com.aleksander.springdemo.coaches.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method for fortunes
        System.out.println(theCoach.getDailyFortunes());

        // close the context
        context.close();
    }
}