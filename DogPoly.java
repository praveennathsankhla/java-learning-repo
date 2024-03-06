package com.oops.polymorphism;

/**
 * Dog class that inherits from Animal
 */
public class DogPoly extends AnimalPoly {
    public DogPoly(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
} 