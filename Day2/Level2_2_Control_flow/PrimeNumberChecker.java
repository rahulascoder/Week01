import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number to check if it's a prime number: ");
        int number = sc.nextInt();

        // Initialize isPrime variable
        boolean isPrime = true;

        // Prime number check for numbers greater than 1
        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } 
		else {
		
            // Check divisibility from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
        }

        //Result
        if (isPrime) {
            System.out.println("The number " + number + " is a Prime Number.");
        } else {
            System.out.println("The number " + number + " is NOT a Prime Number.");
        }
        sc.close();
    }
}
