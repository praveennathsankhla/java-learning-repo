package com.oops.exceptions;

/**
 * Custom exception class
 */
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

/**
 * Class demonstrating custom exception handling
 */
public class CustomException {
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        CustomException demo = new CustomException();
        
        try {
            // Test valid age
            demo.checkAge(25);
            
            // Test invalid age
            demo.checkAge(200);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 