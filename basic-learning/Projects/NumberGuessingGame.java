package Projects;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            // Calculate the difference between the guess and the actual number
            int difference = Math.abs(userGuess - numberToGuess);

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            } else if (difference <= 5) {
                System.out.println("Close! But not quite right.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        scanner.close();
    }
}
