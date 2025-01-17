import java.util.Scanner;

public class BMIStatus {
    public static void main(String[] args) {
	
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //The number of persons
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
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details for each person
        System.out.println("Details of each person: ");
		for(int i=0; i<numberOfPersons;i++){
			System.out.println("Height of person "+(i+1)+ "is" +height[i]+" Weight is " + weight[i]+ " and BMI is " + weightStatus[i]);
		}
        
        sc.close();
    }
}
