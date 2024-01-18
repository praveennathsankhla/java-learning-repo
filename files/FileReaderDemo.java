package com.oops.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class demonstrating file reading
 */
public class FileReaderDemo {
    public void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading file: " + fileName);
            System.out.println("-------------------");
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        FileReaderDemo demo = new FileReaderDemo();
        demo.readFile("test.txt");
    }
} 