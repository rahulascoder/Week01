import java.util.*;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // is a leap year?
    public static boolean isLeapYear(int year) {
  
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // number of days in a month
    public static int getNumberOfDays(int month, int year) {
	
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // the first day of the month using the Gregorian Calendar Algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;  // The day of the week for the 1st day of the month
        return d0;
    }

    // print the calendar for the given month and year
    public static void printCalendar(int month, int year) {
	
        String monthName = getMonthName(month);
        int numberOfDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar header
        System.out.println("         " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {  // Start a new line after every Saturday
                System.out.println();
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        printCalendar(month, year);

        scanner.close();
    }
}
