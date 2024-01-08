package com.oops.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Class demonstrating ArrayList operations
 */
public class ArrayListDemo {
    public void demonstrateArrayList() {
        // Create ArrayList
        List<String> fruits = new ArrayList<>();
        
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Initial list: " + fruits);
        
        // Add at specific index
        fruits.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + fruits);
        
        // Remove element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
        
        // Get element
        System.out.println("Element at index 0: " + fruits.get(0));
        
        // Check if element exists
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        
        // Size of list
        System.out.println("Size of list: " + fruits.size());
        
        // Clear list
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }

    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
        demo.demonstrateArrayList();
    }
} 