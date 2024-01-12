package com.oops.encapsulation;

/**
 * Car class demonstrating encapsulation
 */
public class CarEncapsulated {
    private String brand;
    private String model;
    private int year;

    public CarEncapsulated(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Setters with validation
    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        if (year >= 1900 && year <= currentYear) {
            this.year = year;
        } else {
            System.out.println("Invalid year. Year should be between 1900 and " + currentYear);
        }
    }

    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        CarEncapsulated car = new CarEncapsulated("Toyota", "Camry", 2020);
        
        car.displayInfo();
        car.setYear(2022);
        car.displayInfo();
        car.setYear(1800); // Should fail
    }
} 