import java.util.Scanner;

public class ChocolateDivision {

    // Method to calculate chocolates per child and remaining chocolates
    public void divideChocolates(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren == 0) {
            System.out.println("Enter valid number ");
            return;
        }
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; 
        int remainingChocolates = numberOfChocolates % numberOfChildren; 

        // Displaying the results
        System.out.println("Each child gets: " + chocolatesPerChild + " chocolates.");
        System.out.println("Remaining chocolates: " + remainingChocolates);
    }

    public static void main(String[] args) {
        
		
        Scanner sc = new Scanner(System.in);

        // Take input for number of chocolates and number of children
        System.out.println("Enter the number of chocolates:");
        int numberOfChocolates = sc.nextInt();

        System.out.println("Enter the number of children:");
        int numberOfChildren = sc.nextInt();

        // Create an object of the class
        ChocolateDivision obj = new ChocolateDivision();

        // Call the method to calculate chocolates per child and remaining chocolates
        obj.divideChocolates(numberOfChocolates, numberOfChildren);
		
		sc.close();
    }
}
