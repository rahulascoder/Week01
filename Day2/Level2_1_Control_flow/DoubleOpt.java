import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking values of a, b, and c from the user
        System.out.print("Enter the value of a (double): ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b (double): ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c (double): ");
        double c = sc.nextDouble();

        // Performing operations
        double result1 = a + b * c;       // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;       // Multiplication (*) has higher precedence than addition (+)
        double result3 = c + a / b;       // Division (/) has higher precedence than addition (+)
        double result4 = a % b + c;       // Modulus (%) has higher precedence than addition (+)

        // Output: Display the results
        System.out.println("The results of Double Operation are " + result1 + " " + result2 + " " + result3 + " and " + result4);

        sc.close();
    }
}
