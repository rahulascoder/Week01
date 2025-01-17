import java.util.*;

public class SpringSeason {

    // Method to check if it is  Spring season or not
    public boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20 && day <= 31) || // March 20 to 31
            (month == 4 && day >= 1 && day <= 30) ||  // April 1 to 30
            (month == 5 && day >= 1 && day <= 31) ||  // May 1 to 31
            (month == 6 && day >= 1 && day <= 20)) {  // June 1 to 20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
	
			//Creating scanner object
			Scanner sc = new Scanner(System.in);
		
            // Taking Input from user
			System.out.println("Enter month in (1-2):");
            int month = sc.nextInt();
			System.out.println("Enter day");
            int day = sc.nextInt();

            // Creating an object of the class
            SpringSeason obj = new SpringSeason();

            // Checking if it's Spring season
            boolean isSpring = obj.isSpringSeason(month, day);

            // Displaying the result
            if (isSpring) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
    }
}
