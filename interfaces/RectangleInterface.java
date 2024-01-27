package com.oops.interfaces;

/**
 * Rectangle class implementing DrawableInterface
 */
public class RectangleInterface implements DrawableInterface {
    private double length;
    private double width;

    public RectangleInterface(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
    }

    public static void main(String[] args) {
        RectangleInterface rectangle = new RectangleInterface(4.0, 6.0);
        rectangle.draw();
    }
} 