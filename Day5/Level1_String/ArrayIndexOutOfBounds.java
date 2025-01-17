import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    public static void generateException(String[] names) {
        System.out.println("accessing an index beyond the array length...");
        
        System.out.println("Name at index 100: " + names[100]);
    }

    
    public static void handleException(String[] names) {
        try {
            System.out.println("accessing an index beyond the array length...");
            
            System.out.println("Name at index 100: " + names[100]);
			
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
			
        } catch (RuntimeException e) {
            
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        
        String[] names = new String[n];

        // user input for the names
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println("Showing ArrayIndexOutOfBoundsException:");

        
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("Handling ArrayIndexOutOfBoundsException:");

        
        handleException(names);

        scanner.close();
    }
}
