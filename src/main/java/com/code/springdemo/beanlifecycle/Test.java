package com.code.springdemo.beanlifecycle;

        import org.springframework.context.support.AbstractApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");


        Car c1 = (Car) context.getBean("c1");
        System.out.println(c1);
        // registering shutdown hoook
        context.close();
    }
}
