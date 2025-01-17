import java.util.Scanner;

public class FactorialWhileLoop {
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
            // Initialize variables for computation
            int factorial = 1;
            int i = 1;

            // Compute factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print the factorial
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        sc.close();
    }
}
