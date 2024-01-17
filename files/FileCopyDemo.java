package com.oops.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class demonstrating file copying
 */
public class FileCopyDemo {
    public void copyFile(String sourceFile, String destinationFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            
            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);
            
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        FileCopyDemo demo = new FileCopyDemo();
        demo.copyFile("source.txt", "destination.txt");
    }
} 