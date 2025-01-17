import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        if (windSpeed < 0) {
            System.out.println("Wind speed cannot be negative.");
            return Double.NaN;
        }
        if (windSpeed < 3) {
            System.out.println("Wind chill calculation is not valid for wind speeds less than 3 mph.");
            return Double.NaN;
        }
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input temperature
        System.out.println("Enter the temperature in Fahrenheit:");
        double temperature = sc.nextDouble();

        // Input wind speed
        System.out.println("Enter the wind speed in mph:");
        double windSpeed = sc.nextDouble();

        // Create an object of the class
        WindChillCalculator obj = new WindChillCalculator();

        // Calculate the wind chill
        double windChill = obj.calculateWindChill(temperature, windSpeed);

        // Display the result
        if (!Double.isNaN(windChill)) {
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        }
		sc.close();
    }
}
