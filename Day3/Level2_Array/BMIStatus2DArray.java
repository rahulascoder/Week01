import java.util.Scanner;

public class BMIStatus2DArray {
    public static void main(String[] args) {
	
        // Creating a Scanner object
        Scanner scn = new Scanner(System.in);

        // Taking input number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scn.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];

        // Input weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");

            // Input and validate height
            do {
                System.out.print("Enter height in centimeter: ");
                personData[i][0] = scn.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value.");
                }
            } while (personData[i][0] <= 0);

            // Input and validate weight
            do {
                System.out.print("Enter weight in kilograms : ");
                personData[i][1] = scn.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value.");
                }
            } while (personData[i][1] <= 0);

            // Calculate BMI
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determining the weight status based on BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Height of person " + (i + 1) + " is " + personData[i][0] + ", Weight is " + personData[i][1] + ", and BMI is " + personData[i][2] + ". Weight Status: " + weightStatus[i]);
        }
		
        scn.close();
    }
}
