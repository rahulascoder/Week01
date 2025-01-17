import java.util.Scanner;

public class LargestNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking three numbers from the user
        System.out.print("Enter the first number: ");
        float number1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float number2 = sc.nextFloat();
        System.out.print("Enter the third number: ");
        float number3 = sc.nextFloat();

        // Check if the first, second, or third number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        //Results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        sc.close();
    }
}
