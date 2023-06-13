package com.code.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class HelloSpringApp {
    static final Logger logger = LoggerFactory.getLogger(HelloSpringApp.class);
    public static void main(String[] args) {

        // create spring container
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);


        // call methods on the bean
        logger.info(theCoach.getDailyWorkout());

        // let's call our new method for fortune
        logger.info(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
