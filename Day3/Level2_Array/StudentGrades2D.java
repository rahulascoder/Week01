import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scn = new Scanner(System.in);

        // The number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scn.nextInt();

        // 2D Array to store marks (3 subjects for each student)
        int[][] marks = new int[numberOfStudents][3]; 

        // Arrays to store percentages and grades
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            // Input marks for each subject
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths"; // Using ternary operator
                do {
                    System.out.print(subject + " marks (positive value): ");
                    marks[i][j] = scn.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks cannot be negative.");
                    }
                } while (marks[i][j] < 0);
            }

            // Calculate percentage for each student
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display the details for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics marks = " + marks[i][0] + ", Chemistry marks = " + marks[i][1] + ", Maths marks = " + marks[i][2] + ", Percentage = " + percentages[i] + ", Grade = " + grades[i]);
        }

        scn.close();
    }
}
