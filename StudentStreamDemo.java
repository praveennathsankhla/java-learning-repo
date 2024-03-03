package com.oops.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class demonstrating stream operations on a list of Student objects
 */
public class StudentStreamDemo {
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
        // Create list of students
        List<Student> students = Arrays.asList(
            new Student("John", 20, 85.5),
            new Student("Alice", 19, 92.0),
            new Student("Bob", 21, 78.5),
            new Student("Emma", 20, 88.0),
            new Student("Mike", 22, 95.5)
        );

        // Filter students with grade >= 85
        System.out.println("Students with grade >= 85:");
        List<Student> highAchievers = students.stream()
                                            .filter(s -> s.getGrade() >= 85)
                                            .collect(Collectors.toList());
        highAchievers.forEach(System.out::println);

        // Get average grade
        System.out.println("\nAverage grade:");
        double averageGrade = students.stream()
                                    .mapToDouble(Student::getGrade)
                                    .average()
                                    .orElse(0.0);
        System.out.println("Average: " + averageGrade);

        // Get names of students older than 20
        System.out.println("\nNames of students older than 20:");
        List<String> olderStudentNames = students.stream()
                                               .filter(s -> s.getAge() > 20)
                                               .map(Student::getName)
                                               .collect(Collectors.toList());
        System.out.println(olderStudentNames);

        // Find student with highest grade
        System.out.println("\nStudent with highest grade:");
        students.stream()
                .max((s1, s2) -> Double.compare(s1.getGrade(), s2.getGrade()))
                .ifPresent(System.out::println);

        // Group students by age
        System.out.println("\nStudents grouped by age:");
        students.stream()
                .collect(Collectors.groupingBy(Student::getAge))
                .forEach((age, studentList) -> {
                    System.out.println("Age " + age + ":");
                    studentList.forEach(s -> System.out.println("  " + s));
                });
    }
} 