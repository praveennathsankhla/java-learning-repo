package com.oops.generics;

/**
 * A generic Calculator class that can perform operations on numbers
 */
public class GenericCalculator<T extends Number> {
    private T first;
    private T second;

    public GenericCalculator(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public double add() {
        return first.doubleValue() + second.doubleValue();
    }

    public double subtract() {
        return first.doubleValue() - second.doubleValue();
    }

    public double multiply() {
        return first.doubleValue() * second.doubleValue();
    }

    public double divide() {
        if (second.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return first.doubleValue() / second.doubleValue();
    }

    public void displayResults() {
        System.out.println("Numbers: " + first + " and " + second);
        System.out.println("Addition: " + add());
        System.out.println("Subtraction: " + subtract());
        System.out.println("Multiplication: " + multiply());
        try {
            System.out.println("Division: " + divide());
        } catch (ArithmeticException e) {
            System.out.println("Division: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create calculators with different number types
        GenericCalculator<Integer> intCalc = new GenericCalculator<>(10, 5);
        GenericCalculator<Double> doubleCalc = new GenericCalculator<>(10.5, 2.5);
        GenericCalculator<Float> floatCalc = new GenericCalculator<>(10.0f, 3.0f);

        // Display results for each calculator
        System.out.println("Integer Calculator:");
        intCalc.displayResults();

        System.out.println("\nDouble Calculator:");
        doubleCalc.displayResults();

        System.out.println("\nFloat Calculator:");
        floatCalc.displayResults();
    }
} 