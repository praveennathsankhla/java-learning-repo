package com.oops.classes;

/**
 * Circle class with overloaded constructors
 */
public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    // Constructor with radius parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Default constructor
    public Circle() {
        this(1.0); // Default radius of 1.0
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public void displayInfo() {
        System.out.println("Circle Information:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {
        // Testing constructor with radius
        Circle circle1 = new Circle(5.0);
        circle1.displayInfo();

        // Testing default constructor
        Circle circle2 = new Circle();
        circle2.displayInfo();
    }
} 