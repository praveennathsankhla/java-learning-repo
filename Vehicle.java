package com.oops.inheritance;

/**
 * Base Vehicle class for inheritance examples
 */
public class Vehicle {
    protected double speed;

    public Vehicle(double speed) {
        this.speed = speed;
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Speed: " + speed + " km/h");
    }
} 