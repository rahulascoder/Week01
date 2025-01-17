import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker2{

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Storing digits
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

    //sum of the digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {  //using for-each loop
            sum += digit;
        }
        return sum;
    }

    //sum of the squares of the digits 
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sumOfDigits = sumOfDigits(digits);
        return number % sumOfDigits == 0;
    }

    //the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        int sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        // Check if Harshad number
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Digit frequency
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
		
        for (int[] freq : frequency) {
            if (freq[1] > 0) {   // displaying digits with non-zero frequency
                System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
            }
        }

        sc.close();
    }
}
