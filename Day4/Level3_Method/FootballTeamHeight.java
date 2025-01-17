import java.util.Random;

public class FootballTeamHeight {

	// Method to generate random heights between 150 and 250 cm
    public static void generateRandomHeights(int[] heights) {
    for (int i = 0; i < heights.length; i++) {
        heights[i] = (int) (Math.random() * 101) + 150; 
		}
	}
	
	// Method to calculate the sum of all elements
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
	
	// Calculating mean height
    public static double calculateMean(int sum, int totalPlayers) {
        return (double) sum / totalPlayers;
    }

    // Method to find the shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
	
    public static void main(String[] args) {
	
        // Create an array to store the heights of 11 players
        int[] heights = new int[11];
        generateRandomHeights(heights);

        // Calculate sum, mean, shortest, and tallest heights
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        //results
        System.out.println("Heights of players (in cm): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean  height: " + mean + " cm");
        System.out.println("Sum of  height: " +sum + " cm");
    }

}
