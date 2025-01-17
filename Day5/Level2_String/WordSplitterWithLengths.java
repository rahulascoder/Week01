import java.util.*;

public class WordSplitterWithLengths {

    // Method to find the length of a string without using the built-in length() method
    public static int findLengthWithoutBuiltIn(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }

    // Method to split the text into words without using the split() method
    public static String[] splitTextWithoutBuiltIn(String text) {
        int length = findLengthWithoutBuiltIn(text);
        int wordCount = 1; 

        // Count spaces and store their indexes
        int[] spaceIndexes = new int[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
                wordCount++;
            }
        }

        // Trim spaceIndexes array to the correct size
        int[] trimmedSpaceIndexes = new int[index];
        for (int i = 0; i < index; i++) {
            trimmedSpaceIndexes[i] = spaceIndexes[i];
        }
        spaceIndexes = trimmedSpaceIndexes;

        // Array to store the words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLengthWithoutBuiltIn(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Split text into words using custom method
        String[] words = splitTextWithoutBuiltIn(inputText);

        // Get words and their lengths in a 2D array
        String[][] wordsWithLengths = getWordsAndLengths(words);

        // Display results
        System.out.println("Word             		Length");
        System.out.println("------------------------");
        for (String[] entry : wordsWithLengths) {
            System.out.println(entry[0] + "    		         " + Integer.parseInt(entry[1]));
        }

        scanner.close();
    }
}
