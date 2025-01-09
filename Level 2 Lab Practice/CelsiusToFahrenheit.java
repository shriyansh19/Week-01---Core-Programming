import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversion formula: (°C × 9/5) + 32 = °F
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output: Temperature in Fahrenheit
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");
    }
}
