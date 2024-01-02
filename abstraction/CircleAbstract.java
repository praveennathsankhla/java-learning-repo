package com.oops.abstraction;

/**
 * Circle class that extends ShapeAbstract
 */
public class CircleAbstract extends ShapeAbstract {
    private double radius;
    private static final double PI = 3.14159;

    public CircleAbstract(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        CircleAbstract circle = new CircleAbstract("Red", 5.0);
        circle.displayInfo();
    }
} 