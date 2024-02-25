package com.oops.inheritance;

/**
 * CircleShape class that inherits from Shape
 */
public class CircleShape extends Shape {
    private double radius;
    private static final double PI = 3.14159;

    public CircleShape(String color, double radius) {
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
        CircleShape circle = new CircleShape("Red", 5.0);
        circle.displayInfo();
    }
} 