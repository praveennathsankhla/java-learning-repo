package com.oops.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Class demonstrating the use of Comparable interface
 */
public class StudentComparable implements Comparable<StudentComparable> {
    private String name;
    private int age;
    private double grade;

    public StudentComparable(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(StudentComparable other) {
        // Compare by grade in descending order
        return Double.compare(other.grade, this.grade);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + "}";
    }

    public static void main(String[] args) {
        // Create a list of students
        List<StudentComparable> students = Arrays.asList(
            new StudentComparable("John", 20, 85.5),
            new StudentComparable("Alice", 19, 92.0),
            new StudentComparable("Bob", 21, 78.5),
            new StudentComparable("Emma", 20, 88.0),
            new StudentComparable("Mike", 22, 95.5)
        );

        // Display unsorted list
        System.out.println("Unsorted list:");
        students.forEach(System.out::println);

        // Sort the list
        Collections.sort(students);

        // Display sorted list
        System.out.println("\nSorted list by grade (descending):");
        students.forEach(System.out::println);
    }
} 