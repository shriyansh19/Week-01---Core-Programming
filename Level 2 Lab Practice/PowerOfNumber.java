import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input values for number and power
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize the result variable to 1
        int result = 1;

        // Loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply the result by the number
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
