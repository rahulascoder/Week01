import java.util.Scanner;

public class SmallestLargestNumbers {

    // Method to find the smallest and largest of three numbers
    public void findSmallestAndLargest(int num1, int num2, int num3) {
	
        int smallest = num1; // Assume num1 is the smallest
        int largest = num1;  // Assume num1 is the largest

        // Compare to find the smallest
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Compare to find the largest
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Display the result
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }

    public static void main(String[] args) {
	
        // Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for three numbers
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();

        // Create an object of the class
        SmallestLargestNumbers obj = new SmallestLargestNumbers();

        // Call the method to find the smallest and largest numbers
        obj.findSmallestAndLargest(num1, num2, num3);
    
		sc.close();
	}
	
}
