import java.util.Scanner;

public class StudentVotingEligibility {

    // Method to generate an array of random ages for the number of students
    public static int[] generateRandomAges(int numStudents) {
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; 
        }
        return ages;
    }

    // Method to determine whether each student can vote based on their age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else {
                result[i][0] = String.valueOf(ages[i]);
                if (ages[i] >= 18) {
                    result[i][1] = "Can Vote";
                } else {
                    result[i][1] = "Cannot Vote";
                }
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayVotingEligibility(String[][] result) {
	
        System.out.println("Age\t\tEligibility");
        System.out.println("----------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of students (default to 10)
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random ages for the students
        int[] studentAges = generateRandomAges(numStudents);

        // Check voting eligibility for each student based on age
        String[][] eligibilityResult = checkVotingEligibility(studentAges);

        // Display the results in tabular format
        displayVotingEligibility(eligibilityResult);

        scanner.close();
    }
}
