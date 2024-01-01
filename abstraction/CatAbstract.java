package com.oops.abstraction;

/**
 * Cat class that extends AnimalAbstract
 */
public class CatAbstract extends AnimalAbstract {
    private String breed;

    public CatAbstract(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the " + breed + " meows: Meow! Meow!");
    }

    @Override
    public void move() {
        System.out.println(name + " the " + breed + " walks gracefully");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        CatAbstract cat = new CatAbstract("Whiskers", "Siamese");
        cat.displayInfo();
        cat.makeSound();
        cat.move();
    }
} 