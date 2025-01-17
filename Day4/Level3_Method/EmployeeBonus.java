import java.util.*;

public class EmployeeBonus {

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] employeeData = new int[10][2]; 
        
        for (int i = 0; i < 10; i++) {
            
            employeeData[i][0] = rand.nextInt(90000) + 10000;
            
            employeeData[i][1] = rand.nextInt(10) + 1;
        }
        return employeeData;
    }

    // calculating new salary and bonus based on years of service
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] newData = new double[10][3]; 
		
        for (int i = 0; i < 10; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = 0;
            
            //bonus based on years of service
            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            
            //new salary after adding bonus
            double newSalary = salary + bonus;
            
            //results in the newData array
            newData[i][0] = salary; // Old Salary
            newData[i][1] = bonus;  // Bonus
            newData[i][2] = newSalary; // New Salary
        }
        return newData;
    }

    // calculating the sum of old salary, new salary, and total bonus
    public static void calculateSums(double[][] newData) {
        double oldSalarySum = 0;
        double newSalarySum = 0;
        double totalBonus = 0;
        
        for (int i = 0; i < 10; i++) {
            oldSalarySum += newData[i][0];
            newSalarySum += newData[i][2];
            totalBonus += newData[i][1];
        }

        // Display the results in a tabular format using System.out.println()
        System.out.println("---------------------------------------------------------");
        System.out.println("| Employee | Old Salary | Bonus | New Salary |");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("| " + (i + 1) + "        | " + newData[i][0] + "   | " + newData[i][1] + " | " + newData[i][2] + " |");
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("Total Old Salary: " + oldSalarySum);
        System.out.println("Total New Salary: " + newSalarySum);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }

    public static void main(String[] args) {
        // Generate employee data (salary and years of service)
        int[][] employeeData = generateEmployeeData();

    
        double[][] newData = calculateNewSalaryAndBonus(employeeData);

        // Display
        calculateSums(newData);
    }
}
