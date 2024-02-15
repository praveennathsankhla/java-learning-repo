package com.oops.collections;

import java.util.TreeSet;
import java.util.Set;

/**
 * Class demonstrating TreeSet operations
 */
public class TreeSetDemo {
    public void demonstrateTreeSet() {
        // Create TreeSet
        Set<String> names = new TreeSet<>();
        
        // Add elements
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        System.out.println("Initial set: " + names);
        
        // Add duplicate (will be ignored)
        names.add("John");
        System.out.println("After adding duplicate: " + names);
        
        // Remove element
        names.remove("Bob");
        System.out.println("After removing Bob: " + names);
        
        // Check if element exists
        System.out.println("Contains Alice? " + names.contains("Alice"));
        
        // Size of set
        System.out.println("Size of set: " + names.size());
        
        // Clear set
        names.clear();
        System.out.println("After clearing: " + names);
    }

    public static void main(String[] args) {
        TreeSetDemo demo = new TreeSetDemo();
        demo.demonstrateTreeSet();
    }
} 