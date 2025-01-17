import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Take an integer input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the user entered a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Iterate from 1 to the number entered by the user
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close the scanner
        sc.close();
    }
}
