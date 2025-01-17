import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number to find its multiplication table: ");
        int number = sc.nextInt();

        // Print the multiplication table from 6 to 9
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        sc.close();
    }
}
