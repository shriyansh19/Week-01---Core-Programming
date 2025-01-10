import java.util.Scanner;

public class GreatestFactor {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize greatestFactor to 1
        int greatestFactor = 1;

        // Loop to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Break the loop once the greatest factor is found
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " beside itself is: " + greatestFactor);

        // Close the scanner
        scanner.close();
    }
}
