import java.util.Scanner;

public class NumberFormat {

    //generating NumberFormatException
    public static void generateException(String text) {
		
        System.out.println("Parse a non-numeric string to an integer: ");
		       
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    
    public static void handleException(String text) {
        try {
            System.out.println("Attempt to parsing a non-numeric string to an integer ");

            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
			
        } catch (NumberFormatException e) {
            
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
			
        } catch (RuntimeException e) {
            
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string to parse as an integer: ");
        String userInput = scanner.nextLine();

        System.out.println("Demonstrating NumberFormatException:");

        
        try {
            generateException(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nHandling NumberFormatException:");

       
        handleException(userInput);

        scanner.close();
    }
}
