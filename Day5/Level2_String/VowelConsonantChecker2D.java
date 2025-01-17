import java.util.*;

public class VowelConsonantChecker2D {

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

    // Method to find vowels and consonants in a string and return the result in a 2D array
    public static String[][] findVowelsAndConsonants(String inputString) {
        String[][] result = new String[inputString.length()][2];  

        // Iterate over each character of the string
        for (int i = 0; i < inputString.length(); i++) {
		
            char ch = inputString.charAt(i);  
            String type = checkCharacterType(ch);  
            result[i][0] = String.valueOf(ch); 
            result[i][1] = type; 
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void display2DArray(String[][] result) {
        System.out.println("Character\tType");
        System.out.println("--------------------");

        // Iterate over the 2D array
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Finding the vowels and consonants
        String[][] result = findVowelsAndConsonants(inputString);

        // Result display in tabular format
        display2DArray(result);
		
        scanner.close();
    }
}
