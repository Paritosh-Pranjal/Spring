package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeanScopeDemoApp {
    private static final Logger logger = LoggerFactory.getLogger(BeanScopeDemoApp.class);

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean result = (theCoach == alphaCoach);

        // print out the results
        logger.info("\nPointing to the same object: {}", result);
        logger.info("\nMemory location for theCoach: {}", theCoach);
        logger.info("\nMemory location for theCoach: {}\n", alphaCoach);

        // close the context
        context.close();
    }
}
