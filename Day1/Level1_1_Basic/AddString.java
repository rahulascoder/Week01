//write a program to concatinate as first name and last name by accepting two string values from user

import java.util.Scanner;

public class AddString{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		//Accepting input
		String firstName = sc.nextLine();
		String secondName = sc.nextLine();
		
		//Concatinating firstName and secondName and showing Output
		
		System.out.println(firstName +" "+ secondName);
	}
}