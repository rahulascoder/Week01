/*The University is charging the student a fee of INR 125000 for the course. 
The University is willing to offer a discount of 10%. 
Write a program to find the discounted amount and discounted price the student will pay for the course.
*/

public class CourseFee{
	public static void main(String args[]){
		
		//Course fee 
		float courseFee = 125000f;
		
		//Discount percent
		float discountPercent  = 10;
		
		//Discounted Amount 
		float discountAmount = (float)(discountPercent/100)*courseFee;
		
		//Discounted Fee 
		float discountedFee = courseFee-discountAmount;
		
		//Output -> Fee paid for course
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " +discountedFee);
		
	}
}