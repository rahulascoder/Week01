//Create a program to swap two numbers

import java.util.Scanner;

public class SwapNumber{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//Taking two input 
		System.out.println("Enter first number: ");
		int number1 = sc.nextInt();
		
		System.out.println("Enter first number: ");
		int number2 = sc.nextInt();
		
		//swapping both numbers
		
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		//output of swap numbers
		System.out.println("The swapped numbers are " + number1 + " and " + number2);
		
		sc.close();
	}
}