package com.oops.generics;

/**
 * A generic Array class that can store and manipulate arrays of any type
 */
public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
        array[index] = value;
    }

    public T get(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
        return array[index];
    }

    public int length() {
        return array.length;
    }

    public void displayArray() {
        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Create arrays of different types
        GenericArray<String> stringArray = new GenericArray<>(3);
        GenericArray<Integer> intArray = new GenericArray<>(4);
        GenericArray<Double> doubleArray = new GenericArray<>(3);

        // Fill string array
        stringArray.set(0, "Hello");
        stringArray.set(1, "World");
        stringArray.set(2, "!");

        // Fill integer array
        intArray.set(0, 1);
        intArray.set(1, 2);
        intArray.set(2, 3);
        intArray.set(3, 4);

        // Fill double array
        doubleArray.set(0, 1.5);
        doubleArray.set(1, 2.5);
        doubleArray.set(2, 3.5);

        // Display arrays
        System.out.println("String Array:");
        stringArray.displayArray();

        System.out.println("\nInteger Array:");
        intArray.displayArray();

        System.out.println("\nDouble Array:");
        doubleArray.displayArray();

        // Demonstrate get method
        System.out.println("\nAccessing elements:");
        System.out.println("String at index 1: " + stringArray.get(1));
        System.out.println("Integer at index 2: " + intArray.get(2));
        System.out.println("Double at index 0: " + doubleArray.get(0));
    }
} 