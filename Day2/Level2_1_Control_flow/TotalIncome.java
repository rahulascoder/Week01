import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Taking salary and bonus from the user
        System.out.print("Enter the salary (INR): ");
        double salary = sc.nextDouble();
        System.out.print("Enter the bonus (INR): ");
        double bonus = sc.nextDouble();

        // Compute total income
        double totalIncome = salary + bonus;

        // Output: Display the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome + ".");

        sc.close();
    }
}
