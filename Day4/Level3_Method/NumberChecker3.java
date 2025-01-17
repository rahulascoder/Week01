import java.util.*;


public class NumberChecker3 {

    //counting no. of digits 
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    //  storing the digits of the number in a array
    public static int[] storeDigits(int number) {
        number = Math.abs(number);
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];

        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // reverse the array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    //Comparing two arrays and check equality
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    //Palindrome checking
    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Duck number checking
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true; 
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

        boolean isPalindrome = isPalindrome(digits);
        System.out.println("Is Palindrome: " + isPalindrome);

        boolean isDuckNumber = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuckNumber);

        sc.close();
    }
}
