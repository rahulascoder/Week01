import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take year as input from the user
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Check if the year is in the Gregorian calendar
        if (year < 1582) {
            System.out.println("The year " + year + " is before the Gregorian calendar. Please enter a year >= 1582.");
        } else {
		
            // First part: Using multiple if-else statements
            System.out.println("\nUsing multiple if-else statements:");
			
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The year " + year + " is a Leap Year.");
                    } else {
                        System.out.println("The year " + year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println("The year " + year + " is a Leap Year.");
                }
            } else {
			
                System.out.println("The year " + year + " is not a Leap Year.");
            }


            // Second part: Using a single if statement with multiple logical conditions
            System.out.println("\nUsing a single if statement:");
			
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year.");
            }
			else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }
        sc.close();
    }
}
