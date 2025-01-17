import java.util.*;

public class CollinearPoints {

    // Method to check if the points are collinear
    public static boolean arePointsCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Slope AB 
        double slopeAB = (y2 - y1) / (x2 - x1);
        // Slope BC 
        double slopeBC = (y3 - y2) / (x3 - x2);
        // Slope AC
        double slopeAC = (y3 - y1) / (x3 - x1);
        
        // Points are collinear if the slopes are equal
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    //checking if the points are collinear using the area of triangle formula
    public static boolean arePointsCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
        // Points are collinear if the area is 0
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Taking input
        System.out.print("Enter coordinates of point A (x1, y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        System.out.print("Enter coordinates of point B (x2, y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        System.out.print("Enter coordinates of point C (x3, y3): ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        
        // Calling methods
        boolean collinearBySlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        if (collinearBySlope) {
            System.out.println("The points are collinear (using slope formula).");
        } else {
            System.out.println("The points are not collinear (using slope formula).");
        }

        boolean collinearByArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        if (collinearByArea) {
            System.out.println("The points are collinear (using area formula).");
        } else {
            System.out.println("The points are not collinear (using area formula).");
        }
        
        sc.close();
    }
}
