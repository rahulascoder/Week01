import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if the lengths of both texts are the same
        if (text1.length() != text2.length()) {
            return false;   
        }

        // Convert both texts to lowercase and create frequency arrays
        int[] freq1 = new int[256];   
        int[] freq2 = new int[256];    

        // Loop through both strings and find the frequency of characters
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;   
            freq2[text2.charAt(i)]++;   
        }

        // Compare the frequency arrays of both texts
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;   
            }
        }

        return true;   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for two texts
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        // Check if the two texts are anagrams
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sc.close();
    }
}
