import java.util.*;

public class StringTrimAndCompare {

    // Method to trim the leading and trailing spaces from a string using charAt()
    public static int[] findTrimIndices(String inputString) {
        int start = 0;
        int end = inputString.length() - 1;

        // Find the index of the first non-space character 
        while (start <= end && inputString.charAt(start) == ' ') {
            start++;
        }

        // Find the index of the last non-space character
        while (end >= start && inputString.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indices in an array
        return new int[]{start, end};
    }

    // Method to create a substring from a string using charAt() method
    public static String createSubstring(String inputString, int start, int end) {
        StringBuilder substring = new StringBuilder();

        // Constructing the substring using charAt() method
        for (int i = start; i <= end; i++) {
            substring.append(inputString.charAt(i));
        }

        return substring.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Strings with different lengths can't be equal
        }

        // Compare the characters of both strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Strings are not equal if characters at any position differ
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Trimming the string using the charAt() method
        int[] trimIndices = findTrimIndices(inputString);
        String trimmedString = createSubstring(inputString, trimIndices[0], trimIndices[1]);

        // Trimming the string using the built-in trim() method
        String trimmedBuiltIn = inputString.trim();

        // Compare the results
        boolean isEqual = compareStrings(trimmedString, trimmedBuiltIn);

        // Display the results
        System.out.println("Trimmed string using charAt(): '" + trimmedString + "'");
        System.out.println("Trimmed string using built-in trim(): '" + trimmedBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + isEqual);

        scanner.close();
    }
}
