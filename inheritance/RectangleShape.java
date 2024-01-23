package com.oops.inheritance;

/**
 * RectangleShape class that inherits from Shape
 */
public class RectangleShape extends Shape {
    private double length;
    private double width;

    public RectangleShape(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    public static void main(String[] args) {
        RectangleShape rectangle = new RectangleShape("Blue", 4.0, 6.0);
        rectangle.displayInfo();
    }
} 