import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for weight (kg) and height (cm)
        System.out.print("Enter weight in kilograms (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in centimeters (cm): ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightM * heightM);

        // Display the BMI result
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Determine weight status based on BMI
        if (bmi < 18.5) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have Normal weight.");
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }

        sc.close();
    }
}
