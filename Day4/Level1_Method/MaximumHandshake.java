import java.util.*;

public class MaximumHandshake{

	//Creating method for combination of handshake
		public int handshake(int number){
			
			//Maximum combination of possible handshake
			int combination = (number*(number-1))/2;
			
			return combination;
		
		}
		
	public static void main(String args[]){
		
		//Creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking input from user 
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		//Creating object of class
		MaximumHandshake obj = new MaximumHandshake();
		
			
		int MaxCombination = obj.handshake(number);
		
		System.out.println("Maximum number of handshakes are " +MaxCombination);
	}

}