import java.util.*;

public class PositiveNegative{
	public static void main(String args[]){
		
		//Creating Scanner Object		
		Scanner sc = new Scanner(System.in);
		
		//Taking input from user
		int input[] = new int[5];
		
		for (int i =0; i<5; i++){
			
			input[i] = sc.nextInt();
		}
		
		//Calculating length of array
		int len = input.length;
		
		for(int j=0; j<len; j++){
			
			//Checking number is +ve , -ve or zero
			if(input[j] > 0){
				System.out.println("This number " + input[j]+ " is Positive");
				
				//Checking number is even or Odd
				if(input[j]%2 == 0){
					System.out.println("This number " + input[j]+ " is Even Number");
				}else{
					System.out.println("This number " + input[j]+ " is Odd Number");
					}
			}else if(input[j] <0)
				{System.out.println("This number " + input[j]+ " is Negative Number");
			
			}else System.out.println("The number is Zero");
		}	
			
		//Checking First and Last number is equal, grater or less
			
			if( input[0] > input[4]){
				System.out.println("First number is greater");
			}else if( input[0] < input[4]){
				System.out.println("First number is less");
			}else	System.out.println("Both number is Equal");
			
		//Close Scanner
		sc.close();	
	}
}