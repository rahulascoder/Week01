import java.util.Random;

public class StudentGradeCalculator {

    // Method to generate random 2-digit scores for students
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3];  
        Random random = new Random();

        // Generate random scores between 0 and 100 for each subject
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(101); 
            scores[i][1] = random.nextInt(101);
            scores[i][2] = random.nextInt(101);
        }
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] results = new double[scores.length][4]; 

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; 
            double average = total / 3.0; 
            double percentage = (total / 300.0) * 100; 

            // Round off the values to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate the grade based on the percentage
    public static String[][] calculateGrade(double[][] results) {
        String[][] grades = new String[results.length][2];  // 2D array to store the grade of each student

        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            String grade = "";

            if (percentage >= 80) {
                grade = "A";
            } else if (percentage >= 70) {
                grade = "B";
            } else if (percentage >= 60) {
                grade = "C";
            } else if (percentage >= 50) {
                grade = "D";
            } else if(percentage >= 40){
                grade = "F";
            }else grade = "R";

            grades[i][0] = "Student " + (i + 1);
            grades[i][1] = grade;
        }
        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.println("Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t\t");
            }
            System.out.print(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%\t\t" + grades[i][1]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numStudents = 5;  

        // Generate random scores for students
        int[][] scores = generateRandomScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateTotalAveragePercentage(scores);

        // Calculate grade based on percentage
        String[][] grades = calculateGrade(results);

        // Display the final scorecard
        displayScorecard(scores, results, grades);
    }
}
