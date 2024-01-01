package com.oops.abstraction;

/**
 * Abstract Animal class demonstrating abstraction
 */
public abstract class AnimalAbstract {
    protected String name;

    public AnimalAbstract(String name) {
        this.name = name;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void makeSound();
    public abstract void move();

    public void displayInfo() {
        System.out.println("Animal Information:");
        System.out.println("Name: " + name);
    }
} 