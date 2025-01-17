import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if the entered number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println(n + " is not a natural number.");
        } else {
            // Calculate the sum using the formula n*(n+1)/2
            int formulaSum = n * (n + 1) / 2;

            // Calculate the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Print the results and compare them
            System.out.println("The sum of " + n + " natural numbers using the formula is: " + formulaSum);
            System.out.println("The sum of " + n + " natural numbers using the for loop is: " + loopSum);

            // Check if both results are the same
            if (formulaSum == loopSum) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("There is a mismatch in the results.");
            }
        }

        // Close the scanner
        sc.close();
    }
}
