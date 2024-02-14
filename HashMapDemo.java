package com.oops.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Class demonstrating HashMap operations
 */
public class HashMapDemo {
    public void demonstrateHashMap() {
        // Create HashMap
        Map<String, Integer> studentScores = new HashMap<>();
        
        // Add key-value pairs
        studentScores.put("John", 85);
        studentScores.put("Alice", 92);
        studentScores.put("Bob", 78);
        System.out.println("Initial map: " + studentScores);
        
        // Update value
        studentScores.put("John", 90);
        System.out.println("After updating John's score: " + studentScores);
        
        // Get value
        System.out.println("Alice's score: " + studentScores.get("Alice"));
        
        // Check if key exists
        System.out.println("Contains Bob? " + studentScores.containsKey("Bob"));
        
        // Remove key-value pair
        studentScores.remove("Bob");
        System.out.println("After removing Bob: " + studentScores);
        
        // Size of map
        System.out.println("Size of map: " + studentScores.size());
        
        // Clear map
        studentScores.clear();
        System.out.println("After clearing: " + studentScores);
    }

    public static void main(String[] args) {
        HashMapDemo demo = new HashMapDemo();
        demo.demonstrateHashMap();
    }
} 