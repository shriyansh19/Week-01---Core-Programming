import java.util.Scanner;
public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user for each conversion
        System.out.println("Enter value in Fahrenheit to convert to Celsius: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit to Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        System.out.println("Enter value in Celsius to convert to Fahrenheit: ");
        double celsius = scanner.nextDouble();
        System.out.println(celsius + " Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        System.out.println("Enter value in Pounds to convert to Kilograms: ");
        double pounds = scanner.nextDouble();
        System.out.println(pounds + " Pounds to Kilograms: " + convertPoundsToKilograms(pounds));

        System.out.println("Enter value in Kilograms to convert to Pounds: ");
        double kilograms = scanner.nextDouble();
        System.out.println(kilograms + " Kilograms to Pounds: " + convertKilogramsToPounds(kilograms));

        System.out.println("Enter value in Gallons to convert to Liters: ");
        double gallons = scanner.nextDouble();
        System.out.println(gallons + " Gallons to Liters: " + convertGallonsToLiters(gallons));

        System.out.println("Enter value in Liters to convert to Gallons: ");
        double liters = scanner.nextDouble();
        System.out.println(liters + " Liters to Gallons: " + convertLitersToGallons(liters));

        scanner.close();
    }
}
