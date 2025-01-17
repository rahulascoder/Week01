import java.util.*;

public class TrigonometricFunctions {

    // Method to calculate trigonometric functions
    public void calculateTrigonometricFunctions(double angleInDegrees) {
        // Convert angle to radians
        double angleInRadians = Math.toRadians(angleInDegrees);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        // Display the results
        System.out.println("Sine of degrees: "+ angleInDegrees+ " is "+ sine);
        System.out.println("Cosine of  degrees: "+ angleInDegrees+ " is "+cosine);
        System.out.println("Tangent of degrees:"+ angleInDegrees+ " is "+tangent);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input angle in degrees
        System.out.println("Enter the angle in degrees:");
        double angleInDegrees = sc.nextDouble();

        // Create an object of the class
        TrigonometricFunctions obj = new TrigonometricFunctions();

        // Calculate trigonometric functions
        obj.calculateTrigonometricFunctions(angleInDegrees);

        sc.close();
    }
}
