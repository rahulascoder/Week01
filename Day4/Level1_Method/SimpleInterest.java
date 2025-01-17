import java.util.*;

public class SimpleInterest{

	//Creating method for simple interset
	public double simpleInterset( double principle, double rate, double time){
		
		double simple_interest = principle*rate*time/100.0;
		return simple_interest;
	}
	
	public static void main(String args[]){
	
		//Creating Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Taking user input for principle , rate and time
		System.out.println("Enter principle: ");
		double principle = sc.nextDouble();
		System.out.println("Enter rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter time: ");
		double time = sc.nextDouble();
		
		
		//Creating object of class SimpleInterest
		SimpleInterest obj = new SimpleInterest();
		
		double SI = obj.simpleInterset(principle,rate,time);
		
		//Displaying result
		System.out.println("The Simple Interest is "+ SI + " for Principal " + principle + " Rate of Interest " + rate + " and Time " +time);
		
	}

}