package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SetterDemoApp {
    static final Logger logger = LoggerFactory.getLogger(SetterDemoApp.class);
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);

        // call methods on the beans
        logger.info(theCoach.getDailyWorkout());

        logger.info(theCoach.getDailyFortune());

        // call our new methods to get the literal values or injected values
        logger.info(theCoach.getEmailAddress());

        logger.info(theCoach.getTeam());

        // close the context
        context.close();
    }
}
