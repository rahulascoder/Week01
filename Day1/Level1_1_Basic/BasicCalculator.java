import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();

        //Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;

        //Handling division separately to avoid division by zero
        double division;
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            division = Double.NaN; // Not a Number, as division by zero is undefined
        }

        // Output results
		System.out.println("The addition , subtraction, multiplication and division of 2 numbers " +number1+ " and" +number2
							+ " is " +addition+","+subtraction+","+multiplication+", and "+ division);
        sc.close();
    }
}
