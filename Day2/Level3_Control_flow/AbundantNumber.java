import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Step 1: Get an integer input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 2: Initialize sum variable
        int sum = 0;

        // Step 3: Run a for loop to find all divisors of the number
        for (int i = 1; i < number; i++) {
            // Step 4: Check if i is a divisor of number
            if (number % i == 0) {
                // Step 5: Add i to sum
                sum += i;
            }
        }

        // Step 6: Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        scanner.close();
    }
}
