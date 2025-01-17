import java.util.Scanner;

public class BMI_Calculator {
    
    // Method to calculate BMI and status
    public static String[] calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;
        
        // Calculating BMI using the formula
        double bmi = weight / (height * height);
        
        // Determining BMI status
        String status = "";
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Return the BMI and status as a string array
        return new String[] {String.format("%.2f", bmi), status};
    }
    
    // Method to process the input data and calculate BMI for all persons
    public static String[][] processBMIData(double[][] data) {
        String[][] results = new String[10][4];
        
        for (int i = 0; i < 10; i++) {
            // Get the weight and height for each person
            double weight = data[i][0];
            double height = data[i][1];
            
            // Call the method to calculate BMI and status
            String[] bmiData = calculateBMI(weight, height);
            
            // Store the results in the 2D array
            results[i][0] = String.format("%.2f", weight);
            results[i][1] = String.format("%.2f", height);
            results[i][2] = bmiData[0];  // BMI
            results[i][3] = bmiData[1];  // Status
        }
        
        return results;
    }
    
    // Method to display the results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + results[i][1] + "\t\t" + results[i][0] + "\t\t" + results[i][2] + "\t\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 2D array to store the weight (kg) and height (cm) of 10 persons
        double[][] data = new double[10][2];
        
        // Take user input for weight and height of each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the details for person " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (in cm): ");
            data[i][1] = sc.nextDouble();
        }
        
        String[][] results = processBMIData(data);
        
        // Display the results in tabular format
        displayResults(results);
        
        sc.close();
    }
}
