package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanLifeCycleDemoApp {

    static final Logger logger = LoggerFactory.getLogger(BeanLifeCycleDemoApp.class);
    public static void main(String[] args) {

     // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

     // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach" , Coach.class);

        logger.error(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
