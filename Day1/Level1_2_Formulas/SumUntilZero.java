import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
	
        // Creating a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Initialize the total variable to 0.0
        double total = 0.0;

        // Create a variable to store the user input
        double number;

        // Use a while loop to continue adding numbers until the user enters 0
        do {
            System.out.print("Enter a number  ");
            number = sc.nextDouble();

            // Add the number to the total if it is not 0
            if (number != 0) {
                total += number;
            }
        } while (number != 0);  // Repeat until the user enters 0

        // Output the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner
        sc.close();
    }
}
