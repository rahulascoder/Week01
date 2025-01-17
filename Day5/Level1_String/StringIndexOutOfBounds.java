import java.util.Scanner;

public class StringIndexOutOfBounds {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String input) {
		
        System.out.println("Accessing a character beyond the string's length  ");
		
        // Intentionally accessing an out-of-bounds index
        System.out.println("Character at index 100: " + input.charAt(100));
    }

    // Method for handling  Exception
    public static void handleException(String input) {
        try {
            System.out.println("Attempting to access a character beyond the string's length");
			
            // Intentionally accessing an out-of-bounds index 
            System.out.println("Character at index 100: " + input.charAt(100));
			
        } catch (StringIndexOutOfBoundsException e) {
			
            // Catch and handle the exception
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
		
		//Creating scanner object
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        System.out.println("Demonstrating StringIndexOutOfBoundsException:");

        // Call the method to generate the exception
        try {
            generateException(userInput);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("Handling StringIndexOutOfBoundsException:");

        // Call the method to handle the exception
        handleException(userInput);

        sc.close();
    }
}
