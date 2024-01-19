package com.oops.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class demonstrating file writing
 */
public class FileWriterDemo {
    public void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Successfully wrote to file: " + fileName);
            
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        FileWriterDemo demo = new FileWriterDemo();
        String content = "Hello, World!\nThis is a test file.\nGoodbye!";
        demo.writeFile("output.txt", content);
    }
} 