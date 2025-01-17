import java.util.Scanner;

public class NumberCheck {

    // Method to check whether a number is positive, negative, or zero
    public int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
	
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter an integer:");
        int number = sc.nextInt();

        // Creating an object of the class
        NumberCheck obj = new NumberCheck();

        // Checking the number and storing the result
        int result = obj.checkNumber(number);

        // Displaying the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
