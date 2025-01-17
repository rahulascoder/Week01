import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate the perimeter of the triangle
    public double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to compute the number of rounds needed to complete 5 km
    public int calculateRounds(double perimeter) {
        
        return (int) Math.ceil(5000/perimeter);
    }

    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input for the triangular park
        System.out.println("Enter the length of the first side of the triangular park in merter:");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of the second side of the triangular park in merter:");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of the third side of the triangular park in merter:");
        double side3 = sc.nextDouble();

        // Creating an object of the class
        TriangularParkRun obj = new TriangularParkRun();

        // Calculating the perimeter
        double perimeter = obj.calculatePerimeter(side1, side2, side3);

        // Calculating the number of rounds
        int rounds = obj.calculateRounds(perimeter);

        // Displaying the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");
    }
}
