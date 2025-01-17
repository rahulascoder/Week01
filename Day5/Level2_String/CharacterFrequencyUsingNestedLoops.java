import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoops {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();  
        int[] frequency = new int[characters.length];  
        String[] result = new String[characters.length];  

        // Loop to find the frequency of each character
        for (int i = 0; i < characters.length; i++) {
            // If the character is not counted yet
            if (characters[i] != '0') {
                frequency[i] = 1; 
                // Inner loop to check for duplicate characters
                for (int j = i + 1; j < characters.length; j++) {
                    // If the character matches and hasn't been counted yet
                    if (characters[i] == characters[j]) {
                        frequency[i]++; 
                        characters[j] = '0';  
                    }
                }
            }
        }

        // Store characters and their frequencies in the result array
        int resultIndex = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[resultIndex] = characters[i] + " - " + frequency[i];
                resultIndex++;
            }
        }

        return result;
    }

    // Method to display the character frequencies
    public static void displayCharacterFrequency(String[] frequencies) {
        System.out.println("Character\tFrequency");
        System.out.println("------------------------");

        for (String frequency : frequencies) {
            if (frequency != null) {
                System.out.println(frequency);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Find the frequency of characters
        String[] frequencies = findCharacterFrequency(input);

        // Display the result
        displayCharacterFrequency(frequencies);

        sc.close();
    }
}
