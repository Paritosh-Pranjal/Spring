package com.code.springdemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MyApp {
    static final Logger logger = LoggerFactory.getLogger(MyApp.class);
    public static void main(String[] args) {

        // create the object
            Coach theCoach = new TrackCoach();

        // use the object
        logger.info(theCoach.getDailyWorkout());

    }
}
