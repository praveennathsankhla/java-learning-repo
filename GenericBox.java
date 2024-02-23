package com.oops.generics;

/**
 * A generic Box class that can hold any type of object
 */
public class GenericBox<T> {
    private T content;

    public GenericBox(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void displayContent() {
        System.out.println("Box contains: " + content);
    }

    public static void main(String[] args) {
        // Create boxes with different types
        GenericBox<String> stringBox = new GenericBox<>("Hello");
        GenericBox<Integer> intBox = new GenericBox<>(42);
        GenericBox<Double> doubleBox = new GenericBox<>(3.14);

        // Display contents
        stringBox.displayContent();
        intBox.displayContent();
        doubleBox.displayContent();

        // Update contents
        stringBox.setContent("World");
        intBox.setContent(100);
        doubleBox.setContent(2.718);

        // Display updated contents
        System.out.println("\nAfter updating:");
        stringBox.displayContent();
        intBox.displayContent();
        doubleBox.displayContent();
    }
} 