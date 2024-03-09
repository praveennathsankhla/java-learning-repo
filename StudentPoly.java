package com.oops.polymorphism;

/**
 * Student class that inherits from Person
 */
public class StudentPoly extends PersonPolymorphic {
    private int rollNo;

    public StudentPoly(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll Number: " + rollNo);
    }
} 