import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);

        //salary as input
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        //years of service as input
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = sc.nextInt();

        // Check if the employee has more than 5 years of service
        if (yearsOfService > 5) {
            
            double bonus = 0.05 * salary;
            System.out.println("The bonus amount is: INR " + bonus);
        } else {
            
            System.out.println("No bonus is applicable.");
        }


        sc.close();
    }
}
