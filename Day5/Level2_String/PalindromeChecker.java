import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Check palindrome using start and end indexes
    public static boolean isPalindromeUsingIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop through the string and compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;   
            }
            start++;
            end--;
        }
        return true;   
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: If start index is greater than or equal to end, return true
        if (start >= end) {
            return true;
        }

        // If characters at start and end do not match, return false
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursively check for the next pair of characters
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Check palindrome by reversing the string
    public static boolean isPalindromeUsingCharArrays(String text) {
        // Reverse the string using charAt()
        char[] originalArray = text.toCharArray();
        char[] reversedArray = new char[originalArray.length];

        // Create the reversed array
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Compare the original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;  // If characters don't match, return false
            }
        }
        return true;  // If loop completes without returning false, it's a palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Logic 1: Check palindrome using start and end indexes
        if (isPalindromeUsingIndexes(input)) {
            System.out.println("Palindrome check (using indexes): Yes");
        } else {
            System.out.println("Palindrome check (using indexes): No");
        }

        // Logic 2: Check palindrome using recursion
        if (isPalindromeRecursive(input, 0, input.length() - 1)) {
            System.out.println("Palindrome check (using recursion): Yes");
        } else {
            System.out.println("Palindrome check (using recursion): No");
        }

        // Logic 3: Check palindrome using character arrays
        if (isPalindromeUsingCharArrays(input)) {
            System.out.println("Palindrome check (using char arrays): Yes");
        } else {
            System.out.println("Palindrome check (using char arrays): No");
        }

        sc.close();
    }
}
