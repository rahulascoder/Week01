import java.util.*;


public class BonousAmountZaraToPay{
	public static void main(String args[]){
	
		//Creating a scanner object
		Scanner sc = new Scanner(System.in);
		
		double salary[] = new double[10];
		double years[] = new double[10];
		double new_Salary[] = new double[10];
		double bonus_Amt[] = new double[10];
		
		double totalBonus = 0.0;
		double totalOldSalary = 0.0;
		double totalNewSalary = 0.0;
		
		int index = 10;
		
		for(int i=0; i<10; i++){
			System.out.println("Enter Your Salary and Year of experemce of Employees ");
			while(true){
				int salaryV=sc.nextDouble();
				int yearV=sc.nextDouble();
				if( salaryV<0 || yearV <0){
				System.out.println("Enter again");
			   }else{
				   salary[i]=salaryV;
				   years[i]=yearV;
				   break;
			   }
		   }
			
				//Another loop to calculate the bounus of 10 employees

				if( years[i] >5){
					bonus_Amt[i] = 0.05*salary[i];
					
					new_Salary[i] = salary[i] + bonus_Amt[i];
				}else{
					bonus_Amt[i] = 0.02*salary[i];
					new_Salary[i] = salary[i] + bonus_Amt[i];
				}
				totalBonus += bonus_Amt[i];
			    totalOldSalary += salary[i];
			    totalNewSalary += new_Salary[i];
		}
		
		        for(int i=0; i<10; i++){
					System.out.println("Old Salary of employees "+(i+1)+" is "+salary[i]+" and year of experience "+years[i]+" and bonus is " +bonus_Amt[i]+" and new  salary "+new_Salary[i]);
				}
				
				// Displaying total bonus and new salary and old salary
		
		        System.out.println(totalBonus);
		        System.out.println(totalOldSalary);
		        System.out.println(totalNewSalary);
	
	}
}