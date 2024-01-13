package com.oops.encapsulation;

/**
 * Rectangle class demonstrating encapsulation
 */
public class RectangleEncapsulated {
    private double length;
    private double width;

    public RectangleEncapsulated(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setters with validation
    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length. Length must be positive.");
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width. Width must be positive.");
        }
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void displayInfo() {
        System.out.println("Rectangle Information:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static void main(String[] args) {
        RectangleEncapsulated rectangle = new RectangleEncapsulated(5.0, 3.0);
        
        rectangle.displayInfo();
        rectangle.setLength(6.0);
        rectangle.setWidth(4.0);
        rectangle.displayInfo();
        rectangle.setLength(-2.0); // Should fail
    }
} 