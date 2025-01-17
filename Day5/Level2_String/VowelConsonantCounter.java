import java.util.*;

public class VowelConsonantCounter {

    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch); 

        // Check if character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Check if character is a consonant (alphabetical letter)
        if ((ch >= 'a' && ch <= 'z')) {
            return "Consonant";
        }

        // If character is not a letter
        return "Not a Letter";
    }

    // Method to count vowels and consonants 
    public static int[] countVowelsAndConsonants(String inputString) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Iterate over each character of the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i); 
            String result = checkCharacterType(ch);

            // Update counts based on the result
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the counts in an array
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calling method for  vowels and consonants
        int[] counts = countVowelsAndConsonants(inputString);

        // Results
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        scanner.close();
    }
}
