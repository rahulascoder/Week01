import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(double a, double b, double c) {
	
        // Calculating delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Check if delta is positive, zero, or negative
        if (delta > 0) {
		
            // Two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
			
        } else if (delta == 0) {
		
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
			
        } else {
		
            // No real roots
            return new double[]{};
        }
    }

    public static void main(String[] args) {
	
        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input values for a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Find the roots
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 2) {
            System.out.println("The two roots are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root is: " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        sc.close();
    }
}
