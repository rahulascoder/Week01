import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Step 1: Get an integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize variables
        int sum = 0; // Variable to store the sum of digits
        int originalNumber = number; // Store the original number for final check

        // Step 3: Use a while loop to calculate the sum of digits
        while (number != 0) {
            // Step 4: Extract the last digit and add it to the sum
            int digit = number % 10;
            sum += digit;

            // Step 5: Remove the last digit from the number
            number = number / 10;
        }

        // Step 6: Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        scanner.close();
    }
}
