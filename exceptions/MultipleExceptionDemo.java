package com.oops.exceptions;

/**
 * Class demonstrating multiple exception handling
 */
public class MultipleExceptionDemo {
    public void processData(String[] data, int index) {
        try {
            // Try to parse the string at the given index
            int number = Integer.parseInt(data[index]);
            System.out.println("Number at index " + index + ": " + number);
            
            // Try to divide by the number
            int result = 100 / number;
            System.out.println("100 divided by " + number + " = " + result);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format at index " + index);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MultipleExceptionDemo demo = new MultipleExceptionDemo();
        
        // Test array index out of bounds
        demo.processData(new String[]{"1", "2"}, 5);
        
        // Test number format exception
        demo.processData(new String[]{"1", "abc"}, 1);
        
        // Test division by zero
        demo.processData(new String[]{"1", "0"}, 1);
        
        // Test valid case
        demo.processData(new String[]{"1", "2"}, 1);
    }
} 