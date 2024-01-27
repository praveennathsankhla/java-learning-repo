package com.oops.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

/**
 * Class demonstrating basic lambda expressions
 */
public class LambdaDemo {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Consumer lambda
        System.out.println("Using Consumer lambda:");
        Consumer<Integer> printNumber = n -> System.out.println("Number: " + n);
        numbers.forEach(printNumber);

        // Using Predicate lambda
        System.out.println("\nUsing Predicate lambda (even numbers):");
        Predicate<Integer> isEven = n -> n % 2 == 0;
        numbers.stream()
              .filter(isEven)
              .forEach(n -> System.out.println("Even number: " + n));

        // Using Function lambda
        System.out.println("\nUsing Function lambda (square of numbers):");
        Function<Integer, Integer> square = n -> n * n;
        numbers.stream()
              .map(square)
              .forEach(n -> System.out.println("Square: " + n));

        // Using multiple lambda expressions
        System.out.println("\nUsing multiple lambda expressions:");
        numbers.stream()
              .filter(n -> n > 5)           // Predicate
              .map(n -> n * 2)              // Function
              .forEach(n -> System.out.println("Double of number > 5: " + n));
    }
} 