package com.oops.files;

import java.io.File;

/**
 * Class demonstrating file deletion
 */
public class FileDeleteDemo {
    public boolean deleteFile(String fileName) {
        File file = new File(fileName);
        
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully: " + fileName);
                return true;
            } else {
                System.out.println("Failed to delete file: " + fileName);
                return false;
            }
        } else {
            System.out.println("File does not exist: " + fileName);
            return false;
        }
    }

    public static void main(String[] args) {
        FileDeleteDemo demo = new FileDeleteDemo();
        demo.deleteFile("delete.txt");
    }
} 