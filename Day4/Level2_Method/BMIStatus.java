import java.util.Scanner;

public class BMIStatus {

    // Method to calculate BMI for each person
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    // Method to determine the weight status based on BMI
    public static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesety";
        }
    }

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);

        // Enter number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] height = new double[numberOfPersons];
        double[] weight = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Input weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter height in meters: ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight in kilograms: ");
            weight[i] = sc.nextDouble();

            // Calculate BMI
            bmi[i] = calculateBMI(height[i], weight[i]);

            // Determine weight status
            weightStatus[i] = getWeightStatus(bmi[i]);
        }

        // Display the details for each person
        System.out.println("Details of each person:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + height[i] + "m, Weight = " + weight[i] + "kg, BMI = " + bmi[i] + ", Status = " + weightStatus[i]);
        }

        sc.close();
    }
}
