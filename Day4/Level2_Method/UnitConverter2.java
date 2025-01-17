import java.util.Scanner;

public class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a conversion:");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter distance in yards: ");
                double yards = sc.nextDouble();
                System.out.println("Distance in feet: " + convertYardsToFeet(yards));
                break;

            case 2:
                System.out.print("Enter distance in feet: ");
                double feet = sc.nextDouble();
                System.out.println("Distance in yards: " + convertFeetToYards(feet));
                break;

            case 3:
                System.out.print("Enter distance in meters: ");
                double meters = sc.nextDouble();
                System.out.println("Distance in inches: " + convertMetersToInches(meters));
                break;

            case 4:
                System.out.print("Enter distance in inches: ");
                double inches = sc.nextDouble();
                System.out.println("Distance in meters: " + convertInchesToMeters(inches));
                break;

            case 5:
                System.out.print("Enter distance in inches: ");
                double inchesToCm = sc.nextDouble();
                System.out.println("Distance in centimeters: " + convertInchesToCentimeters(inchesToCm));
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option (1-5).");
        }

        sc.close();
    }
}
