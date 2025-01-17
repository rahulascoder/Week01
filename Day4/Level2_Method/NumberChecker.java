import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is positive or negative
    public static String isPositive(int num) {
        if (num < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    // Method to check if a number is even or odd
    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
		
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        System.out.println("Enter 5 numbers:");
		
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Check if each number is positive or negative and even or odd for positive numbers
		
        for (int i = 0; i < numbers.length; i++) {
		
            String posNeg = isPositive(numbers[i]);
			
            System.out.print("Number " + (i + 1) + ": " + numbers[i] + " is " + posNeg);
			
            if (posNeg.equals("Positive")) {
                System.out.println(" and " + isEven(numbers[i]));
            } else {
                System.out.println();
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
		
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        sc.close();
    }
}
