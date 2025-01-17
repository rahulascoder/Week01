import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number > 0) {
            int i = 1;  // Initialize counter for the while loop

            // Loop using while until i is greater than number
            while (i <= number) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    // Print the number if it's neither divisible by 3 nor 5
                    System.out.println(i);
                }
                i++;  // Increment the counter
            }
        } else {
            System.out.println("Please enter a positive number.");
        }

        // Close scanner
        sc.close();
    }
}
