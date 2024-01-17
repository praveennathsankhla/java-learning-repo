package com.oops.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class demonstrating file appending
 */
public class FileAppendDemo {
    public void appendToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content);
            writer.newLine();
            System.out.println("Successfully appended to file: " + fileName);
            
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        FileAppendDemo demo = new FileAppendDemo();
        String content = "This is appended content.";
        demo.appendToFile("append.txt", content);
    }
} 