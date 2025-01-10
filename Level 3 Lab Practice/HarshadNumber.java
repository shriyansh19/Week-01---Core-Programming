import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum variable to store sum of digits
        int sum = 0, originalNumber = number;

        // Loop to calculate the sum of digits
        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit from number
        }

        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

        // Close the scanner
        scanner.close();
    }
}
