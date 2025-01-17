import java.util.*;

public class CanVote{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//Declare array
		int age[] = new int[10];
		
		System.out.println("Enter the age: ");
		
		//Input the element in array
		for (int i =0; i<10; i++){	
			age[i] = sc.nextInt();
		}
		
		int length = age.length;
		
		//Checking age is valid for vote or not
		for (int j =0; j<length; j++){
			
			if(age[j] <1){
				System.exit(0);
				
			}else if(age[j] >= 18){
				System.out.println("The age " + age[j] + " can vote");
			}else { System.out.println("The student with the age " + age[j]+ " cannot vote");}
		}
		
		sc.close();
	}
}