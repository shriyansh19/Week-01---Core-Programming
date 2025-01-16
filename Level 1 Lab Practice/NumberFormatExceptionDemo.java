import java.util.Scanner;

public class NumberFormatExceptionDemo {
    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String input) {
        int number = Integer.parseInt(input); // Parsing invalid number
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number as a string: ");
        String input = scanner.next();

        // Uncomment the next line to see unhandled exception
        // generateNumberFormatException(input);

        // Handling the exception
        handleNumberFormatException(input);
    }
}
