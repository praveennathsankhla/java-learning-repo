package com.oops.classes;

/**
 * Calculator class with overloaded methods
 */
public class Calculator {
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Add an array of integers
    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Testing all add methods
        System.out.println("Adding two integers: " + calc.add(5, 3));
        System.out.println("Adding three integers: " + calc.add(5, 3, 2));
        System.out.println("Adding two doubles: " + calc.add(5.5, 3.2));
        
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Adding array of integers: " + calc.add(numbers));
    }
} 