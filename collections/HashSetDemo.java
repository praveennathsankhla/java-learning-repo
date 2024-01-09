package com.oops.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Class demonstrating HashSet operations
 */
public class HashSetDemo {
    public void demonstrateHashSet() {
        // Create HashSet
        Set<String> colors = new HashSet<>();
        
        // Add elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Initial set: " + colors);
        
        // Try to add duplicate
        colors.add("Red");
        System.out.println("After adding duplicate Red: " + colors);
        
        // Remove element
        colors.remove("Green");
        System.out.println("After removing Green: " + colors);
        
        // Check if element exists
        System.out.println("Contains Blue? " + colors.contains("Blue"));
        
        // Size of set
        System.out.println("Size of set: " + colors.size());
        
        // Clear set
        colors.clear();
        System.out.println("After clearing: " + colors);
    }

    public static void main(String[] args) {
        HashSetDemo demo = new HashSetDemo();
        demo.demonstrateHashSet();
    }
} 