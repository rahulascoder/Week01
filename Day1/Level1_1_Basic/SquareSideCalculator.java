import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input: perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scn.nextDouble();

        // Calculate the side of the square
        double side = perimeter / 4;

        // Output the results
        System.out.printf("The length of the side is %.2f, whose perimeter is %.2f.%n", side, perimeter);

        scn.close();
    }
}
