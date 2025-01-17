import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];  
        
        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;  
        }
        
        // Create a 2D array to store characters and their frequencies
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }
        
        // Create a 2D array to store unique characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);  
                result[index][1] = String.valueOf(frequency[i]);  
                index++;
            }
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
