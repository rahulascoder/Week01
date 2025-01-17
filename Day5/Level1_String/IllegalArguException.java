import java.util.Scanner;

public class IllegalArguException {

    // Method to generate the exception
    public static void generateException(String input) {
        // Intentionally setting the start index greater than the end index
        int startIndex = 5;
        int endIndex = 2;
        
        // This will throw an IllegalArgumentException
        System.out.println("Generating exception...");
        System.out.println(input.substring(startIndex, endIndex));
    }

    // Method to handle the exception
    public static void handleException(String input) {
        try {
            // Intentionally setting the start index greater than the end index
            int startIndex = 5;
            int endIndex = 2;
            
            // This will throw an IllegalArgumentException
            System.out.println("Attempting to handle exception...");
            System.out.println(input.substring(startIndex, endIndex));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Calling the method to generate the exception
        try {
            generateException(userInput);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Calling the method to handle the exception
        handleException(userInput);

        scanner.close();
    }
}
