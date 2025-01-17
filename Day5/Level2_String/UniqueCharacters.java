import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of the string without using String's length() method
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                char ch = text.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length]; 
        int index = 0; 

        // Outer loop to iterate through each character
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to check if the character has already appeared
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If character is unique, add it to the result array
            if (isUnique) {
                uniqueChars[index] = currentChar;
                index++;
            }
        }

        // Return the array containing only unique characters
        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to display the unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Find unique characters in the string
        char[] uniqueChars = findUniqueCharacters(input);
        
        // Display the unique characters
        displayUniqueCharacters(uniqueChars);
        
        sc.close();
    }
}
