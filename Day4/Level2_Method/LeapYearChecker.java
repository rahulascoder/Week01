import java.util.*;

public class LeapYearChecker {

    // Method to check if a year is a leap year using conditions
	
    public boolean isLeapYearConditionA(int year) {
	
	
        // Condition Divisible by 4 and not divisible by 100
        return (year % 4 == 0) && (year % 100 != 0);
    }

    // Method to check if a year is a leap year using condition B
    public boolean isLeapYearConditionB(int year) {
	
        // Condition Divisible by 400
        return (year % 400 == 0);
    }

    public static void main(String args[]) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");

        // Taking user input
        int year = sc.nextInt();

        // Checking if year is valid
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
            System.exit(0);
        }

        // Creating object for method call
        LeapYearChecker obj = new LeapYearChecker();

        // Calling methods to check leap year conditions
        boolean conditionA = obj.isLeapYearConditionA(year);
        boolean conditionB = obj.isLeapYearConditionB(year);

        // Determining if the year is a leap year
        if (conditionA || conditionB) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close(); // Closing the scanner
    }
}
