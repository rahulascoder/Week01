import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input Principal, Rate, and Time from the user
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the Time (in years): ");
        double time = sc.nextDouble();

        //Calculate Simple Interest 
        double simpleInterest = (principal * rate * time) / 100;

        // Output
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + " and Time " + time);

        sc.close();
    }
}
