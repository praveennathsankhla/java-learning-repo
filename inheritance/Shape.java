package com.oops.inheritance;

/**
 * Abstract Shape class for inheritance examples
 */
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double getArea();
    public abstract double getPerimeter();

    public void displayInfo() {
        System.out.println("Shape Information:");
        System.out.println("Color: " + color);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
} 