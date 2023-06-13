package com.code.springdemo.beanlifecycle;

        import org.springframework.context.support.AbstractApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

public class Test {
    static final Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");


        Car c1 = (Car) context.getBean("c1");
        logger.info("{}", c1);
        // registering shutdown hoook
        context.close();
    }
}
