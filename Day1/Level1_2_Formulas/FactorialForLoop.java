import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Take an integer input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the user has entered a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Initialize a variable for factorial computation
            int factorial = 1;

            // Compute factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        sc.close();
    }
}
