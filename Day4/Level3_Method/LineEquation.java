import java.util.*;

public class LineEquation {

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // calculating the equation of the line passing through two points
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        // Calculating slope of line
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate y-intercept b 
        double b = y1 - (m * x1);
        
        // Returning an array containing the slope and y-intercept
        return new double[] { m, b };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coordinates of the first point (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter the coordinates of the second point (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculating the Euclidean distance between the two points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between the points is: " + distance);

        // Calculating the equation of the line passing through the two points
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        // Output 
        System.out.println("The equation of the line passing through the points is:");
        System.out.println("y = " + slope + "x + " + yIntercept);

        scanner.close();
    }
}
