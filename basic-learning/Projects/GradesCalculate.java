package Projects;

import java.util.Scanner;

public class GradesCalculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and marks for each subject
        System.out.println("Enter the first Subject name: ");
        String subject1 = scanner.nextLine();
        System.out.println("Enter Marks in " + subject1 + " Out of 100: ");
        int subject1m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the second Subject name: ");
        String subject2 = scanner.nextLine();
        System.out.println("Enter Marks in " + subject2 + " Out of 100: ");
        int subject2m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the third Subject name: ");
        String subject3 = scanner.nextLine();
        System.out.println("Enter Marks in " + subject3 + " Out of 100: ");
        int subject3m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the fourth Subject name: ");
        String subject4 = scanner.nextLine();
        System.out.println("Enter Marks in " + subject4 + " Out of 100: ");
        int subject4m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the fifth Subject name: ");
        String subject5 = scanner.nextLine();
        System.out.println("Enter Marks in " + subject5 + " Out of 100: ");
        int subject5m = scanner.nextInt();


        int totalMarks = subject1m + subject2m + subject3m + subject4m + subject5m;
        int average = totalMarks / 5;
        double cgpa = (totalMarks / 500.0) * 10;


        System.out.println("Your average Marks per Subject: " + average);
        System.out.printf("You got %.2f CGPA%n", cgpa);
        if (cgpa >= 8.5 && cgpa <= 10) {
            System.out.println("You Got A Grade");
        } else if (cgpa >= 6.5 && cgpa < 8.5) {
            System.out.println("You Got B Grade");
        } else if (cgpa >= 4.5 && cgpa < 6.5) {
            System.out.println("You Got C Grade");
        } else if (cgpa >= 3.6 && cgpa < 4.5) {
            System.out.println("You Got D Grade");
        } }}