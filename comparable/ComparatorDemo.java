package com.oops.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Class demonstrating the use of Comparator interface
 */
public class ComparatorDemo {
    static class Student {
        private String name;
        private int age;
        private double grade;

        public Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public String getName() { return name; }
        public int getAge() { return age; }
        public double getGrade() { return grade; }

        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + ", grade=" + grade + "}";
        }
    }

    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = Arrays.asList(
            new Student("John", 20, 85.5),
            new Student("Alice", 19, 92.0),
            new Student("Bob", 21, 78.5),
            new Student("Emma", 20, 88.0),
            new Student("Mike", 22, 95.5)
        );

        // Display unsorted list
        System.out.println("Unsorted list:");
        students.forEach(System.out::println);

        // Sort by name
        System.out.println("\nSorted by name:");
        Collections.sort(students, Comparator.comparing(Student::getName));
        students.forEach(System.out::println);

        // Sort by age
        System.out.println("\nSorted by age:");
        Collections.sort(students, Comparator.comparing(Student::getAge));
        students.forEach(System.out::println);

        // Sort by grade (descending)
        System.out.println("\nSorted by grade (descending):");
        Collections.sort(students, Comparator.comparing(Student::getGrade).reversed());
        students.forEach(System.out::println);

        // Sort by age and then by grade
        System.out.println("\nSorted by age and then by grade:");
        Collections.sort(students, 
            Comparator.comparing(Student::getAge)
                     .thenComparing(Student::getGrade));
        students.forEach(System.out::println);
    }
} 