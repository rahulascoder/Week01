import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store salary, years of service, bonus, and new salary for 10 employees
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Variables to store total bonus, old salary, and new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop for 10 employees
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            // Input salary with validation
            while (true) {
                System.out.print("Salary: ");
                if (scanner.hasNextDouble()) {
                    salaries[i] = scanner.nextDouble();
                    if (salaries[i] > 0) break;
                } else {
                    scanner.next(); // Clear invalid input
                }
                System.out.println("Invalid salary. Please enter a positive number.");
            }

            // Input years of service with validation
            while (true) {
                System.out.print("Years of Service: ");
                if (scanner.hasNextDouble()) {
                    yearsOfService[i] = scanner.nextDouble();
                    if (yearsOfService[i] >= 0) break;
                } else {
                    scanner.next(); // Clear invalid input
                }
                System.out.println("Invalid years of service. Please enter a non-negative number.");
            }
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Output results
        System.out.println("\nBonus and Salary Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println( salaries[i] + bonuses[i]+ newSalaries[i]);
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}
