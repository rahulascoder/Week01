import java.util.Scanner;

public class SmallestNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the three numbers from the user
        System.out.print("Enter the first number: ");
        float number1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float number2 = sc.nextFloat();
        System.out.print("Enter the third number: ");
        float number3 = sc.nextFloat();

        // Check if the first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Output
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        sc.close();
    }
}
