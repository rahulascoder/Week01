import java.util.Scanner;

public class TemperatureConversionCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Taking temperature in Fahrenheit from the user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Conversion formula: (°F − 32) × 5/9 = °C
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Output: Display the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

        sc.close();
    }
}
