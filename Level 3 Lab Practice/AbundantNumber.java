import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum variable to store sum of divisors
        int sum = 0;

        // Loop to find divisors and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }

        // Close the scanner
        scanner.close();
    }
}
