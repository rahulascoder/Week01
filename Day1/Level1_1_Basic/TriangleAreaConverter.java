import java.util.Scanner;

public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Base and Height in centimeters
        System.out.print("Enter the base of the triangle in centimeters: ");
        double baseInCm = sc.nextDouble();

        System.out.print("Enter the height of the triangle in centimeters: ");
        double heightInCm = sc.nextDouble();

        // Calculate area in square centimeters
        double areaInCm2 = 0.5 * baseInCm * heightInCm;

        // Convert base and height to inches
        double baseInInches = baseInCm / 2.54;
        double heightInInches = heightInCm / 2.54;

        // Calculate area in square inches
        double areaInInches2 = 0.5 * baseInInches * heightInInches;

        // Convert height to feet and inches
        int heightInFeet = (int) (heightInInches / 12);
        double remainingInches = heightInInches % 12;

        // Output results
		System.out.printf("Area of the triangle: %.2f cm²%n", areaInCm2);
        System.out.printf("Area of the triangle: %.2f in²%n", areaInInches2);
        System.out.printf("Your height in cm is %.2f, while in feet is %d feet and %.2f inches.%n", heightInCm, heightInFeet, remainingInches);

        sc.close();
    }
}
