package com.oops.polymorphism;

/**
 * Base Person class for polymorphism examples
 */
public class PersonPolymorphic {
    protected String name;
    protected int age;

    public PersonPolymorphic(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Person Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
} 