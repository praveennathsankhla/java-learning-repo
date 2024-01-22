package com.oops.inheritance;

/**
 * Car class that inherits from Vehicle
 */
public class Car extends Vehicle {
    private String brand;

    public Car(double speed, String brand) {
        super(speed);
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println(brand + " car is starting");
    }

    @Override
    public void stop() {
        System.out.println(brand + " car is stopping");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }

    public static void main(String[] args) {
        Car car = new Car(120.0, "Toyota");
        car.displayInfo();
        car.start();
        car.stop();
    }
} 