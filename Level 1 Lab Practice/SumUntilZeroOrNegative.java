import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Initialize total sum to 0.0
        double total = 0.0;

        // Infinite loop to keep taking user input
        while (true) {
            System.out.print("Enter a number (0 or negative number to stop): ");
            double number = scanner.nextDouble();

            // Check if the entered number is 0 or negative, then break the loop
            if (number <= 0) {
                break;
            }

            // Add the entered number to the total sum
            total += number;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}
