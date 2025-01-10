import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize count variable to 0
        int count = 0;

        // Loop to count the digits
        while (number != 0) {
            number /= 10; // Remove the last digit from number
            count++; // Increase count
        }

        // Display the number of digits
        System.out.println("Number of digits: " + count);

        // Close the scanner
        scanner.close();
    }
}
