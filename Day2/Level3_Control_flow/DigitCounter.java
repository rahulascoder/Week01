import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        // Step 1: Get an integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 2: Initialize count variable
        int count = 0;

        // Step 3: Handle the case for 0 (special case as it has 1 digit)
        if (number == 0) {
            count = 1;
        } else {
            // Step 4: Use a loop to count the digits
            while (number != 0) {
                // Step 5: Remove the last digit from number
                number = number / 10;

                // Step 6: Increase the count
                count++;
            }
        }

        // Step 7: Display the count
        System.out.println("Number of digits: " + count);

        scanner.close();
    }
}
