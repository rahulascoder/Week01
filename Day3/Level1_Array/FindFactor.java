import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
			
                // Check if array needs resizing
                if (index == maxFactor) {
				
                    // Double the maxFactor size
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];

                    // Copy elements to the new array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign the new array
                    factors = temp;
                }

                // Add the factor to the array
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
