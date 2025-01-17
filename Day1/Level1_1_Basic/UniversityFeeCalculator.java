import java.util.Scanner;

public class UniversityFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the student fee
        System.out.print("Enter the student fee (in INR): ");
        double studentFee = scanner.nextDouble();

        // Taking user input for the discount percentage
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        // Calculate the discounted amount
        double discountedAmount = (studentFee * discountPercentage) / 100;

        // Calculate the final price will pay
        double finalPrice = studentFee - discountedAmount;

        // Output
		System.out.println("The discount amount is INR " + discountedAmount + " and final discounted fee is INR " + finalPrice);


        scanner.close();
    }
}
