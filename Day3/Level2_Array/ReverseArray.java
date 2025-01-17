import java.util.*;

public class ReverseArray{

	public static void main(String args[]){
	
		//Creating Scanner Object
		Scanner sc = new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter the number :");
		int number = sc.nextInt();

		int count =0;
		int temp=number;
		while(temp>0){
			count++;
		    temp/=10;
		}
		//Saving digit in an array
		int[] reverseArray= new int[count];
		
		for(int i=0; i<count; i++){
			
			reverseArray[i] = number%10;
			number/=10;
			
		}
		//Displaying the reverse array
		for(int i=0; i<count; i++){
			
	      System.out.print(reverseArray[i]);
			
		}
		
	}
}