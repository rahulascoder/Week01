import java.util.*;

public class ChangingKilometerToMiles{
	public static void main(String args[]){
		
		//Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		//Distance in Kilometer
		double distance_km = sc.nextDouble();
		
		//Distance in Miles
		double distance_miles = distance_km/1.6;
		
		System.out.println("The total miles is " + distance_miles + " for the given " +distance_km +" km");
		
		
	}
}