import java.util.Scanner;

public class UnitConverter1 {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        // Conversion factor from kilometers to miles
        double km2miles = 0.621371;
        // Convert kilometers to miles and return the result
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        // Conversion factor from miles to kilometers
        double miles2km = 1.60934;
        // Convert miles to kilometers and return the result
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        // Conversion factor from meters to feet
        double meters2feet = 3.28084;
        // Convert meters to feet and return the result
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        // Conversion factor from feet to meters
        double feet2meters = 0.3048;
        // Convert feet to meters and return the result
        return feet * feet2meters;
    }

    // Main method to take user input and test the conversion methods
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // User input for kilometers to miles conversion
        System.out.print("Enter distance in kilometers: ");
        double km = scanner.nextDouble();
        System.out.println(km + " kilometers is equal to " + convertKmToMiles(km) + " miles.");
        
        // User input for miles to kilometers conversion
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles is equal to " + convertMilesToKm(miles) + " kilometers.");
        
        // User input for meters to feet conversion
        System.out.print("Enter distance in meters: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters is equal to " + convertMetersToFeet(meters) + " feet.");
        
        // User input for feet to meters conversion
        System.out.print("Enter distance in feet: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet is equal to " + convertFeetToMeters(feet) + " meters.");

        // Close the scanner to avoid memory leak
        scanner.close();
    }
}
