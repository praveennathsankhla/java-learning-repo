package com.oops.interfaces;

/**
 * Circle class implementing DrawableInterface
 */
public class CircleInterface implements DrawableInterface {
    private double radius;

    public CircleInterface(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    public static void main(String[] args) {
        CircleInterface circle = new CircleInterface(5.0);
        circle.draw();
    }
} 