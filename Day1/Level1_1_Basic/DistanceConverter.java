import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        // Input: distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scn.nextDouble();

        // Conversion to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Output results
        System.out.printf("Distance in feet "+ distanceInFeet+ "Distance in Yards " + distanceInYards + "Distance in Miles " + distanceInMiles);


        scn.close();
    }
}
