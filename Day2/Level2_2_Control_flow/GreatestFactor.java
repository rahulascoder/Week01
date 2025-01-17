import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize the greatestFactor variable
        int greatestFactor = 1;

        // Loop through the numbers from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
		
            if (number % i == 0) {  // If i is a factor of the number
                greatestFactor = i;  // Update greatestFactor
                break;  // Exit the loop once the greatest factor is found
            }
        }

        // Output the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

        sc.close();
    }
}
