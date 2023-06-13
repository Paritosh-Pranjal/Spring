package com.code.springdemo.beanlifecycle;

public class Car  {
    private  double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting properties");
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
        System.out.println("Inside the init method");
    }

    public void destroy()
    {
        System.out.println("Inside the destroy method");
    }
}
