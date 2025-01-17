import java.util.*;

public class YoungestAndHeighest{
	public static void main(String args[]){
	
		//Creating Scanner Object to Take input from users
		Scanner sc = new Scanner(System.in);
		
		
		String name[] = new String[3];
		name[0]="Amar";
		name[1]="Akbar";
		name[2]="Anthony";
		//Array variable for taking Age of 3 friends
		double age[] = new double[3];
				
		//Array variable for taking Height of 3 friends
		double height[] = new double[3];
		
		//Loop for storing Age of 3 friend  in array
		
		System.out.println("Enter the age of 3 friends :");
		for(int i=0; i<3; i++){
			age[i] = sc.nextDouble();
		}
		
		//Loop for storing height of 3 friend  in array
		System.out.println("Enter the height of 3 friends :");
		for(int i=0; i<3; i++){
			height[i] = sc.nextDouble();
		}
		
		//Finding youngest of all
		int younger_index=-1;
		double younger_age = 1000;
		for(int i=0; i<3; i++){
			if(age[i] < younger_age){
				younger_age = age[i];
				younger_index=i;
			}
		}
		
		//Finding youngest of all
		double tallest = -1;
		int taller_index=-1;
		for(int i=0; i<3; i++){
			if(height[i] > tallest){
				tallest = height[i];
				taller_index=i;
			}
			
		}
		
		System.out.println("The youngest friend is "+name[younger_index] );
		System.out.println("The Tallest friend is "+name[taller_index] );
	}
}