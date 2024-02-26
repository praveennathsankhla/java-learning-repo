package com.oops.inheritance;

/**
 * Base Animal class for inheritance examples
 */
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void displayInfo() {
        System.out.println("Animal Information:");
        System.out.println("Name: " + name);
    }
} 