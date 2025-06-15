package basics;
import java.util.Scanner;

public class FibbonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number  Fibonic series: ");
        int n = scanner.nextInt();

        // Handle edge cases
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci series up to " + n);
            int first = 0, second = 1;

            for (int i = 1; i <= n; i++) {
                System.out.print(first + " ");
                int next = first + second;
                first = second; 
                second = next; 
            }
        }

        scanner.close();
    }
}
