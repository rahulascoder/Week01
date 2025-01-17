import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        //Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking user for input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define an array to store digits, with a maximum size of 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // Initialize index to track the position in the array
        int index = 0;

        // Extract digits from the number and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                System.out.println("Max digit capacity reached.");
                break;
            }

            // Add the last digit to the array
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Initialize variables for largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Find the largest and second largest digits in the array
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Close the scanner
        sc.close();
    }
}
