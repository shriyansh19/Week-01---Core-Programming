import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Conversion formula: (°F − 32) × 5/9 = °C
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Output: Temperature in Celsius
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
    }
}
