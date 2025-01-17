import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking values of a, b, and c from the user
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        // Performming operation
        int result1 = a + b * c;       // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;       // Multiplication (*) has higher precedence than addition (+)
        int result3 = c + a / b;       // Division (/) has higher precedence than addition (+)
        int result4 = a % b + c;       // Modulus (%) has higher precedence than addition (+)

        // Output: Display the results
		System.out.println("The results of Int Operationis are " + result1 + " " + result2 + " " +result3+ " and "+ result4); 

        sc.close();
    }
}
