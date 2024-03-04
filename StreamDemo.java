package com.oops.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class demonstrating Java Stream operations
 */
public class StreamDemo {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter and collect
        System.out.println("Filter even numbers and collect to list:");
        List<Integer> evenNumbers = numbers.stream()
                                         .filter(n -> n % 2 == 0)
                                         .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // Map and collect
        System.out.println("\nMap numbers to their squares and collect to list:");
        List<Integer> squares = numbers.stream()
                                     .map(n -> n * n)
                                     .collect(Collectors.toList());
        System.out.println(squares);

        // Reduce (sum of numbers)
        System.out.println("\nSum of all numbers:");
        int sum = numbers.stream()
                        .reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // Count
        System.out.println("\nCount numbers greater than 5:");
        long count = numbers.stream()
                           .filter(n -> n > 5)
                           .count();
        System.out.println("Count: " + count);

        // Find first
        System.out.println("\nFind first number greater than 5:");
        numbers.stream()
               .filter(n -> n > 5)
               .findFirst()
               .ifPresent(n -> System.out.println("First number > 5: " + n));

        // Any match
        System.out.println("\nCheck if any number is greater than 9:");
        boolean anyGreaterThan9 = numbers.stream()
                                        .anyMatch(n -> n > 9);
        System.out.println("Any number > 9: " + anyGreaterThan9);

        // All match
        System.out.println("\nCheck if all numbers are less than 11:");
        boolean allLessThan11 = numbers.stream()
                                      .allMatch(n -> n < 11);
        System.out.println("All numbers < 11: " + allLessThan11);
    }
} 