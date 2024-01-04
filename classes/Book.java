package com.oops.classes;

/**
 * Book class with overloaded constructors
 */
public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor with all parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Constructor with only title and author
    public Book(String title, String author) {
        this(title, author, 0.0);
    }

    public void displayInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Testing constructor with all parameters
        Book book1 = new Book("Java Programming", "John Smith", 29.99);
        book1.displayInfo();

        // Testing constructor with only title and author
        Book book2 = new Book("Python Basics", "Jane Doe");
        book2.displayInfo();
    }
} 