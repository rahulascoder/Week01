import java.util.Scanner;

public class StringCharComparison {

    // Method to return characters in a string 
    public static char[] getCharsFromString(String input) {
		
        char[] characters = new char[input.length()];
		
        for (int i = 0; i < input.length(); i++) {
            characters[i] = input.charAt(i);
        }
        return characters;
    }

    // Comparing two character arrays 
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Call to get method from string
        char[]  = getCharsFromString(userInput);

        // Use built-in toCharArray() method to get characters
        char[] builtInChars = userInput.toCharArray();

        // Compare the two arrays
        boolean areEqual = compareCharArrays(customChars, builtInChars);

        // result
        System.out.println("Characters using user-defined method: " + new String(customChars));
        System.out.println("Characters using built-in toCharArray() method: " + new String(builtInChars));
        System.out.println("Are both arrays equal? " + areEqual);

        scanner.close();
    }
}
