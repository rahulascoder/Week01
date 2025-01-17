import java.util.*;

public class MultiplecationTable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//Taking input 
		int number = sc.nextInt();
		
		//Taking Interger array to store result
		int array[] = new int[10];
		
		for (int i=0; i<10; i++){
		
			//Multiplication table
			array[i] = number*(i+1);
			
			//Display table
			System.out.println(number+" * "+(i+1)+ " = " +array[i]);
		}
	}
}