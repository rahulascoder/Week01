import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Creating scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter a positive integer:");
        int n = sc.nextInt();

        // Checking validate value of n
        if (n <= 0) {
            System.out.println("Enter a positive integer.");
            return;
        }

        // Creating an object of the class
        SumOfNaturalNumbers obj = new SumOfNaturalNumbers();

        // Calculating the sum
        int sum = obj.calculateSum(n);

        // Displaying the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
