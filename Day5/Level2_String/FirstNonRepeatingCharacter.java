import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256]; 
        
        // Loop through the string to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; 
        }
        
        // Loop through the string again to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) {
                return currentChar; 
            }
        }
        
        
        return '-';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(input);
        
        // Display the result
        if (result != '-') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        
        sc.close();
    }
}
