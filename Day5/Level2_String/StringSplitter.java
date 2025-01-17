import java.util.*;


public class StringSplitter {

    // Finding length of a string without using the built-in length() method
    public static int findLengthWithoutBuiltIn(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return count;
    }

    // Method to split the text into words without using the split() method
    public static String[] splitTextWithoutBuiltIn(String text) {
	
		//Calling method to findLengthWithoutBuiltIn
		
        int length = findLengthWithoutBuiltIn(text);
        int wordCount = 1; 
		
        // Counting spaces and store their indexes in a single loop
        int[] spaceIndexes = new int[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
                wordCount++;
            }
        }

        // Trim spaceIndexes array to the correct size
        spaceIndexes = Arrays.copyOf(spaceIndexes, index);

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

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Split text using custom method
        String[] customSplitWords = splitTextWithoutBuiltIn(inputText);

        // Split text using built-in method
        String[] builtInSplitWords = inputText.split(" ");

        // Comparing
        boolean isSame = compareStringArrays(customSplitWords, builtInSplitWords);

        // Results
        System.out.println("Words split using custom method: " + Arrays.toString(customSplitWords));
        System.out.println("Words split using built-in split() method: " + Arrays.toString(builtInSplitWords));
        System.out.println("Are both methods producing the same result? " + isSame);

        scanner.close();
    }
}
