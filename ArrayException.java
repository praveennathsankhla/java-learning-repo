package com.oops.exceptions;

/**
 * Class demonstrating array index out of bounds exception handling
 */
public class ArrayException {
    public void accessArray(int[] arr, int index) {
        try {
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds for array of length " + arr.length);
        }
    }

    public static void main(String[] args) {
        ArrayException demo = new ArrayException();
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Test valid index
        demo.accessArray(numbers, 2);
        
        // Test invalid index
        demo.accessArray(numbers, 10);
    }
} 