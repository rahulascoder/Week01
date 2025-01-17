import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Taking temperature in Celsius from the user
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Conversion formula: (°C × 9/5) + 32 = °F
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output: Display the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

        sc.close();
    }
}
