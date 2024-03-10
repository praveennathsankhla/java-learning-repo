package com.oops.polymorphism;

/**
 * Teacher class that inherits from Person
 */
public class TeacherPoly extends PersonPolymorphic {
    private String subject;

    public TeacherPoly(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        // Demonstrating polymorphism
        PersonPolymorphic person = new PersonPolymorphic("John", 30);
        PersonPolymorphic student = new StudentPoly("Alice", 20, 101);
        PersonPolymorphic teacher = new TeacherPoly("Mr. Smith", 45, "Mathematics");

        System.out.println("Displaying Person:");
        person.display();

        System.out.println("\nDisplaying Student:");
        student.display();

        System.out.println("\nDisplaying Teacher:");
        teacher.display();
    }
} 