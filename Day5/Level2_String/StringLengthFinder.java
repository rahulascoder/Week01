import java.util.*;

public class StringLengthFinder {

    // Method to find the length of a string buit-in method
    public static int lengthWithoutBuiltIn(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        // Finding the length 
        int customLength = lengthWithoutBuiltIn(inputString);

        // Finding the length using built-in method
        int builtInLength = inputString.length();

        //results
        System.out.println("Length of the string without built-in method: " + customLength);
        System.out.println("Length of the string using built-in method: " + builtInLength);

        scanner.close();
    }
}
