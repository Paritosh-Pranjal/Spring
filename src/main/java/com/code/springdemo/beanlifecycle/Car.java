package com.code.springdemo.beanlifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Car  {
    static final Logger logger = LoggerFactory.getLogger(Car.class);
    private  double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        logger.info("Setting properties");
        this.price = price;
    }

    public Car(){
        super();
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }

    public void init()
    {
        logger.info("Inside the init method");
    }

    public void destroy()
    {
        logger.info("Inside the destroy method");
    }
}
