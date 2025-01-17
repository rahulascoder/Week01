import java.util.*;

public class SumOfNaturalNumber{

	//Creating method to add all natural number recusively
	public int recursiveSumOfNumber(int number){
		
		
		int sum =0;
		for(int i=0; i<=number; i++){
			
			sum +=i;
		}
		System.out.println("Sum of natural number using recursion is "+sum);

		
		//return value
		return sum;
		
	}
	
	//Creating another method to add natural number using formula
	public int sumUsingFormula(int number){
	
		//int sum2 =0;
		int sum2 = number*(number+1)/2;
		
		System.out.println("Sum of natural number using formula is "+sum2);
		
		//retrun value
		return sum2;
	}


	public static void main(String args[]){
		
		//Creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter natural number: ");
		
		//Taking user from input
		int number = sc.nextInt();
		
		//Checking if number is natural number or not
		if(number<=0){
			System.exit(0);
		}
		
		//creating object for method
		SumOfNaturalNumber obj= new SumOfNaturalNumber();
		
		//Calling method for recursive sum of numbers
		//int obj=SumOfNaturalNumber.recursiveSumOfNumber(number);
		//int obj=SumOfNaturalNumber.sumUsingFormula(number);
		
		int summ = obj.recursiveSumOfNumber(number);
		int summ2 = obj.sumUsingFormula(number);
		
		//Comparing both sum and printing result
		
		if(summ == summ2){
			System.out.println("Both sum are equal: " + summ+ " and " +summ2);
		}else System.out.println("Not equal sum");
	
		sc.close();
	}

}