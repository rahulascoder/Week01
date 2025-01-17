import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scn = new Scanner(System.in);

        // Take number input from the user
        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        // Convert the number to a string to easily extract digits
        String numberStr = Integer.toString(number);

        // Array to store the frequency of digits (size 10 for digits 0-9)
        int[] frequency = new int[10];

        // Loop through each character of the number string
        for (int i = 0; i < numberStr.length(); i++) {
            // Get the digit at the current position
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            // Increment the frequency count for that digit
            frequency[digit]++;
        }

        // Display the frequency of each digit
        System.out.println("Frequency of each digit in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {  // Display only digits that appear in the number
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        scn.close();
    }
}
