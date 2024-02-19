package com.oops.exceptions;

/**
 * Calculator class with exception handling
 */
public class CalculatorException {
    public double divide(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        CalculatorException calc = new CalculatorException();
        
        // Test valid division
        System.out.println("10 / 2 = " + calc.divide(10, 2));
        
        // Test division by zero
        System.out.println("10 / 0 = " + calc.divide(10, 0));
    }
} 