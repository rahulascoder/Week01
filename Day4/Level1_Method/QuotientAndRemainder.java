import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to calculate and display the quotient and remainder
    public void calculateQuotientAndRemainder(int dividend, int divisor) {
	
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        int quotient = dividend / divisor;  // Division operator
        int remainder = dividend % divisor; // Modulus operator

        // Display the results
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }

    public static void main(String[] args) {
        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for two integers
        System.out.println("Enter the dividend:");
        int dividend = sc.nextInt();

        System.out.println("Enter the divisor:");
        int divisor = sc.nextInt();

        // Create an object of the class
        QuotientAndRemainder obj = new QuotientAndRemainder();

        // Call the method to calculate quotient and remainder
        obj.calculateQuotientAndRemainder(dividend, divisor);
		
		sc.close();
    }
}
