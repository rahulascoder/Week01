import java.util.*;

public class AthleteRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking input of the sides of the triangular park
        System.out.print("Enter the length of side1 (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the length of side2 (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the length of side3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3; // in meters

        // Convert 5 km to meters
        double totalDistance = 5 * 1000; 

        // Calculate the number of rounds
        double rounds = totalDistance / perimeter;

        //Displaying the result
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");

        sc.close();
    }
}
