import java.util.*;

public class WindChill {
    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind chill formula: 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * windSpeed^0.16
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();
		
		System.out.print("Enter the wind speed: ");
        double windSpeed = input.nextDouble();

        // Calculating wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Output result
        System.out.println("Wind Chill Temperature: " + windChill);
		
		input.close();
    }
}
