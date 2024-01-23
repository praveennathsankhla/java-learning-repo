package com.oops.inheritance;

/**
 * Dog class that inherits from Animal
 */
public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(name + " the " + breed + " is eating dog food");
    }

    public void bark() {
        System.out.println(name + " the " + breed + " is barking");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.displayInfo();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
} 