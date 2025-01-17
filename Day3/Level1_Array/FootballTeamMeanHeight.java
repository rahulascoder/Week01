import java.util.Scanner;

public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        // Declare an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0;

        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the heights of 11 players:");

        // Loop to get input values from the user and calculate the sum
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Print the mean height
        System.out.println("The mean height of the football team is:"+ mean);

        
        scanner.close();
    }
}
