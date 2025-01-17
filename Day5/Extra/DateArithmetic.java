import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        //Date-time formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //Enter a date
        System.out.println("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        // Input date
        LocalDate date = LocalDate.parse(inputDate, formatter);

        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks from the updated date
        updatedDate = updatedDate.minusWeeks(3);

        // the result
        System.out.println("Updated date after adding and subtracting: " + updatedDate.format(formatter));
        
        scanner.close();
    }
}
