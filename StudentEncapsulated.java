package com.oops.encapsulation;

/**
 * Student class demonstrating encapsulation
 */
public class StudentEncapsulated {
    private int rollNo;
    private String name;
    private double marks;

    public StudentEncapsulated(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Setters with validation
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Marks should be between 0 and 100.");
        }
    }

    public char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else if (marks >= 60) return 'D';
        else return 'F';
    }

    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        StudentEncapsulated student = new StudentEncapsulated(101, "John Doe", 85.5);
        
        student.displayInfo();
        student.setMarks(95.0);
        student.displayInfo();
        student.setMarks(150.0); // Should fail
    }
} 