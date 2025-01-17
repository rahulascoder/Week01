import java.util.*;

public class VolumeOfEarth{
	public static void main(String arga[]){
		
		//Radius of Earth in km
		double radius_km = 6378;
		
		//Radius of Earth in miles
		double radius_miles = 6378*1.6;
		
		//Volume of Earth in kilometers
		double volume_of_earth_in_km = (4/3)*Math.PI*Math.pow(radius_km, 3);
		
		//Volume of Earth in miles
		double volume_of_earth_in_miles = (4/3)*Math.PI*Math.pow(radius_miles, 3);
		
		//Output
		System.out.println("The volume of earth in cubic kilometers is " + volume_of_earth_in_km + "cubic miles is " + volume_of_earth_in_miles ); 
	}
}