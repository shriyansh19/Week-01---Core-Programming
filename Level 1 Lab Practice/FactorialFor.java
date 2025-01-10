import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number >= 0) {
            int factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the result
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("The number is not a positive integer.");
        }
    }
}
