package com.oops.encapsulation;

/**
 * Employee class demonstrating encapsulation
 */
public class EmployeeEncapsulated {
    private int id;
    private String name;
    private double salary;

    public EmployeeEncapsulated(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        setSalary(salary);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setters with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += (salary * percentage / 100);
            System.out.println("Raise of " + percentage + "% applied.");
        } else {
            System.out.println("Invalid raise percentage.");
        }
    }

    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        EmployeeEncapsulated employee = new EmployeeEncapsulated(1001, "John Smith", 50000.0);
        
        employee.displayInfo();
        employee.giveRaise(10.0);
        employee.displayInfo();
        employee.setSalary(-1000.0); // Should fail
    }
} 