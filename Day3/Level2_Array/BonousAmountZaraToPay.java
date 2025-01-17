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
		
		
		for(int i=0; i<10; i++){
			System.out.println("Enter the salary and Year of experience of Employees :");
			while(true){
				System.out.println("Enter salary of "+(i+1)+" employee");
				double salaryVariable=sc.nextDouble();
				
				System.out.println("Enter year of experience  "+(i+1)+" employee");
				double yearVariable=sc.nextDouble();
				
				if( salaryVariable<0 || yearVariable <0){
				System.out.println("Enter a valid salary and year of experience");
			    }else{
				   salary[i]=salaryVariable;
				   years[i]=yearVariable;
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
		        // Displaying all the details of employee 
		        for(int i=0; i<10; i++){
					System.out.println("Old Salary of employees "+(i+1)+" is "+salary[i]+" and year of experience "+years[i]+" and bonus is " +bonus_Amt[i]+" and new  salary "+new_Salary[i]);
				}
				
				// Displaying total bonus and new salary and old salary
		
		        System.out.println("Total bounous of all employees "+totalBonus);
		        System.out.println("Total old Salary of all employees "+totalOldSalary);
		        System.out.println("Total new Salary of all employees "+totalNewSalary);
	
	}
}