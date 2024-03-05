package com.oops.polymorphism;

/**
 * Cat class that inherits from Animal
 */
public class CatPoly extends AnimalPoly {
    public CatPoly(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow! Meow!");
    }

    public static void main(String[] args) {
        // Demonstrating polymorphism
        AnimalPoly animal = new AnimalPoly("Generic Animal");
        AnimalPoly dog = new DogPoly("Buddy");
        AnimalPoly cat = new CatPoly("Whiskers");

        System.out.println("Generic Animal Sound:");
        animal.makeSound();

        System.out.println("\nDog Sound:");
        dog.makeSound();

        System.out.println("\nCat Sound:");
        cat.makeSound();
    }
} 