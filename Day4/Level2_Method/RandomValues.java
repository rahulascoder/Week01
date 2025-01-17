import java.util.Arrays;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        
        for (int i = 0; i < size; i++) {
		
            // Generating a random 4-digit number (1000 to 9999)
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
		// Calculate the sum, min and max
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];

			if (numbers[i] < min) {
				min = numbers[i];
			}

			if (numbers[i] > max) {
				max = numbers[i];
				}
		}
        // Calculate average
        double average = sum / numbers.length;

        // Return the average, min, and max as an array
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        // Size of the array (5 random 4-digit numbers)
        int size = 5;
        
        // Generate random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        // Find average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum Value: " + results[1]);
        System.out.println("Maximum Value: " + results[2]);
    }
}
