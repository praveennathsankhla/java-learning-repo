package com.oops.exceptions;

/**
 * Class demonstrating number format exception handling
 */
public class NumberFormatExceptionDemo {
    public int parseNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + str + "' is not a valid number");
            return 0;
        }
    }

    public static void main(String[] args) {
        NumberFormatExceptionDemo demo = new NumberFormatExceptionDemo();
        
        // Test valid number
        System.out.println("Parsed number: " + demo.parseNumber("123"));
        
        // Test invalid number
        System.out.println("Parsed number: " + demo.parseNumber("abc"));
    }
} 