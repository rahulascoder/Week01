import java.util.*;

public class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for each student
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            // Generate random 2-digit scores between 10 and 99 for Physics, Chemistry, and Math
            scores[i][0] = rand.nextInt(90) + 10;
            scores[i][1] = rand.nextInt(90) + 10;
            scores[i][2] = rand.nextInt(90) + 10;
        }
        return scores;
    }


    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][4]; 
		
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            // Round off the values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
            results[i][3] = i + 1;
        }
        return results;
    }

    
    public static void displayScorecard(double[][] results, int[][] scores) {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Student No. | Physics | Chemistry | Math | Total | Average | Percentage");
        System.out.println("-----------------------------------------------------------------------------");
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(
                results[i][3] + "\t\t" +
                scores[i][0] + "\t\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t\t" +
                results[i][0] + "\t\t" +
                results[i][1] + "\t\t" +
                results[i][2]
            );
        }
        System.out.println("------------------------------------------------------------------------------");
    }

 
    public static void main(String[] args) {
        int numStudents = 5;

        int[][] scores = generateScores(numStudents);

        double[][] results = calculateResults(scores);
        
        // Display the scorecard in a tabular format
        displayScorecard(results, scores);
    }
}
