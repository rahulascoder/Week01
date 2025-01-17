import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the starting countdown number
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        // Countdown start
        while (counter >= 1) {
            System.out.println("T-" + counter); // Print the current countdown value
            counter--; 
        }

        // Print the message when the countdown finishes
        System.out.println("Launch!");

        // Close the scanner
        sc.close();
    }
}
