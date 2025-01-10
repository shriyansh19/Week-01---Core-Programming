import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Keep asking for input until user enters 0
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double number = scanner.nextDouble();

            // Check if the entered number is 0 to stop the loop
            if (number == 0) {
                break;
            }

            total += number; // Add number to total
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);
    }
}
