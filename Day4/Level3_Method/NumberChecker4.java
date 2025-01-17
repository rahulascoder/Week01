import java.util.*;

public class NumberChecker4 {

    //checking if a number is a prime number
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // checking neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // checking spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    //checking automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    //checking number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = isPrimeNumber(number);
        System.out.println("Is Prime Number: " + isPrime);

        boolean isNeon = isNeonNumber(number);
        System.out.println("Is Neon Number: " + isNeon);

        boolean isSpy = isSpyNumber(number);
        System.out.println("Is Spy Number: " + isSpy);

        boolean isAutomorphic = isAutomorphicNumber(number);
        System.out.println("Is Automorphic Number: " + isAutomorphic);

        boolean isBuzz = isBuzzNumber(number);
        System.out.println("Is Buzz Number: " + isBuzz);

        sc.close();
    }
}
