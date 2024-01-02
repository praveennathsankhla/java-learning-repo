package com.oops.abstraction;

/**
 * Dog class that extends AnimalAbstract
 */
public class DogAbstract extends AnimalAbstract {
    private String breed;

    public DogAbstract(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the " + breed + " barks: Woof! Woof!");
    }

    @Override
    public void move() {
        System.out.println(name + " the " + breed + " runs on four legs");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        DogAbstract dog = new DogAbstract("Buddy", "Golden Retriever");
        dog.displayInfo();
        dog.makeSound();
        dog.move();
    }
} 