import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = sc.nextDouble();

        // Conversion constants
        final double CM_TO_INCHES = 2.54;
        final int INCHES_IN_FOOT = 12;

        // Convert height to inches
        double heightInInches = heightInCm / CM_TO_INCHES;

        // Calculate feet and remaining inches
        int feet = (int) (heightInInches / INCHES_IN_FOOT);
        double remainingInches = heightInInches % INCHES_IN_FOOT;

        // Output the result
        System.out.printf("Your height in cm is " + heightInCm + " while in feet is "+ feet+ " and inches " +remainingInches);

        sc.close();
    }
}
