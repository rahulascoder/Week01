import java.util.*;

public class NumberChecker5 {

    // Method to find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Finding greatest factor of a number
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1]; 
    }

    // the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    //the product of the factors 
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    //the product of the cube of the factors using 
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube the factor
        }
        return product;
    }

    //  checking if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number;
        return sumOfProperDivisors == number;
    }

    // checking if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number; 
        return sumOfProperDivisors > number;
    }

    //if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfProperDivisors = sumOfFactors(factors) - number; 
        return sumOfProperDivisors < number;
    }

    // Checking if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sumOfFactorials = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        return sumOfFactorials == number;
    }

    // finding the factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        int greatestFactor = greatestFactor(factors);
        System.out.println("Greatest factor: " + greatestFactor);

        int sumFactors = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sumFactors);

        int productFactors = productOfFactors(factors);
        System.out.println("Product of factors: " + productFactors);

        double productCubes = productOfCubesOfFactors(factors);
        System.out.println("Product of cubes of factors: " + productCubes);

        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is Perfect Number: " + isPerfect);

        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is Abundant Number: " + isAbundant);

        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is Deficient Number: " + isDeficient);

        boolean isStrong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + isStrong);

        sc.close();
    }
}
