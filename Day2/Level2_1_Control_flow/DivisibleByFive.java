import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisibleByFive = (number % 5 == 0);

        // Output
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleByFive);

        sc.close();
    }
}
