package com.oops.collections;

import java.util.LinkedList;
import java.util.List;

/**
 * Class demonstrating LinkedList operations
 */
public class LinkedListDemo {
    public void demonstrateLinkedList() {
        // Create LinkedList
        List<String> names = new LinkedList<>();
        
        // Add elements
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        System.out.println("Initial list: " + names);
        
        // Add at beginning
        ((LinkedList<String>) names).addFirst("Tom");
        System.out.println("After adding Tom at beginning: " + names);
        
        // Add at end
        ((LinkedList<String>) names).addLast("Sarah");
        System.out.println("After adding Sarah at end: " + names);
        
        // Get first and last elements
        System.out.println("First element: " + ((LinkedList<String>) names).getFirst());
        System.out.println("Last element: " + ((LinkedList<String>) names).getLast());
        
        // Remove first and last elements
        ((LinkedList<String>) names).removeFirst();
        ((LinkedList<String>) names).removeLast();
        System.out.println("After removing first and last: " + names);
        
        // Size of list
        System.out.println("Size of list: " + names.size());
        
        // Clear list
        names.clear();
        System.out.println("After clearing: " + names);
    }

    public static void main(String[] args) {
        LinkedListDemo demo = new LinkedListDemo();
        demo.demonstrateLinkedList();
    }
} 