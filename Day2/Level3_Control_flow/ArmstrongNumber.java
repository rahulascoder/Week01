import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Step 1: Get an integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize variables
        int sum = 0; // Variable to store the sum of cubes of digits
        int originalNumber = number; // Variable to keep track of the original number

        // Step 3: Use a while loop to process each digit of the number
        while (number != 0) {
            // Step 4: Find the last digit using modulus operator
            int digit = number % 10;

            // Step 5: Cube the digit and add to the sum
            sum += Math.pow(digit, 3);

            // Step 6: Remove the last digit using division operator
            number = number / 10;
        }

        // Step 7: Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
