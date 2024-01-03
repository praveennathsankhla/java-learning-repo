package com.oops.abstraction;

/**
 * Rectangle class that extends ShapeAbstract
 */
public class RectangleAbstract extends ShapeAbstract {
    private double length;
    private double width;

    public RectangleAbstract(String color, double length, double width) {
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
        RectangleAbstract rectangle = new RectangleAbstract("Blue", 4.0, 6.0);
        rectangle.displayInfo();
    }
} 