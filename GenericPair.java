package com.oops.generics;

/**
 * A generic Pair class that can hold two objects of the same type
 */
public class GenericPair<T> {
    private T first;
    private T second;

    public GenericPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void swap() {
        T temp = first;
        first = second;
        second = temp;
    }

    public void displayPair() {
        System.out.println("Pair: (" + first + ", " + second + ")");
    }

    public static void main(String[] args) {
        // Create pairs with different types
        GenericPair<String> stringPair = new GenericPair<>("Hello", "World");
        GenericPair<Integer> intPair = new GenericPair<>(1, 2);
        GenericPair<Double> doublePair = new GenericPair<>(1.5, 2.5);

        // Display pairs
        System.out.println("Initial pairs:");
        stringPair.displayPair();
        intPair.displayPair();
        doublePair.displayPair();

        // Swap elements
        stringPair.swap();
        intPair.swap();
        doublePair.swap();

        // Display swapped pairs
        System.out.println("\nAfter swapping:");
        stringPair.displayPair();
        intPair.displayPair();
        doublePair.displayPair();
    }
} 