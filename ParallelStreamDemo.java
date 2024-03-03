package com.oops.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Class demonstrating parallel stream operations
 */
public class ParallelStreamDemo {
    public static void main(String[] args) {
        // Create a large list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // Sequential processing
        System.out.println("Sequential Processing:");
        long startTime = System.nanoTime();
        
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .map(n -> {
                   try {
                       TimeUnit.MILLISECONDS.sleep(100); // Simulate processing
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   return n * n;
               })
               .forEach(n -> System.out.println("Sequential: " + n));

        long sequentialTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime);
        System.out.println("Sequential processing time: " + sequentialTime + "ms");

        // Parallel processing
        System.out.println("\nParallel Processing:");
        startTime = System.nanoTime();
        
        numbers.parallelStream()
               .filter(n -> n % 2 == 0)
               .map(n -> {
                   try {
                       TimeUnit.MILLISECONDS.sleep(100); // Simulate processing
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   return n * n;
               })
               .forEach(n -> System.out.println("Parallel: " + n));

        long parallelTime = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime);
        System.out.println("Parallel processing time: " + parallelTime + "ms");

        // Compare processing times
        System.out.println("\nPerformance Comparison:");
        System.out.println("Sequential time: " + sequentialTime + "ms");
        System.out.println("Parallel time: " + parallelTime + "ms");
        System.out.println("Speedup: " + (double) sequentialTime / parallelTime + "x");
    }
} 