package com.oops.polymorphism;

/**
 * Base Animal class for polymorphism examples
 */
public class AnimalPoly {
    protected String name;

    public AnimalPoly(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound");
    }

    public void displayInfo() {
        System.out.println("Animal Information:");
        System.out.println("Name: " + name);
    }
} 