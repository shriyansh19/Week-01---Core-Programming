import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum and originalNumber variables
        int sum = 0, originalNumber = number;

        // Loop to calculate the sum of cubes of digits
        while (number != 0) {
            int digit = number % 10; // Find the last digit
            sum += Math.pow(digit, 3); // Cube the digit and add to sum
            number /= 10; // Remove the last digit from number
        }

        // Check if the number is equal to the sum of cubes of its digits
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }
}
