import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // Method to find unique characters in a string using charAt() method
    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int index = 0;

        // Loop through the text to find unique characters
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is already in the uniqueChars array
            for (int j = 0; j < index; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[index] = currentChar;
                index++;
            }
        }

        // Return only the filled part of the uniqueChars array
        char[] result = new char[index];
        System.arraycopy(uniqueChars, 0, result, 0, index);
        return result;
    }

    // Method to find the frequency of characters in a string and return the result in a 2D array
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];  

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; 
        }

        // Call the uniqueCharacters method to get unique characters in the text
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];
        
        // Loop through the unique characters and store their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);  
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    // Method to display the frequency of characters
    public static void displayCharacterFrequency(String[][] frequencies) {
        System.out.println("Character\tFrequency");
        System.out.println("------------------------");

        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + "\t\t" + frequencies[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find the frequency of characters
        String[][] frequencies = findCharacterFrequency(input);

        // Display the result
        displayCharacterFrequency(frequencies);

        sc.close();
    }
}
