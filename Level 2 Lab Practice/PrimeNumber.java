import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is greater than 1
        if (number > 1) {
            boolean isPrime = true;  // Initialize boolean variable to store prime number status
            
            // Loop through numbers from 2 to the entered number-1
            for (int i = 2; i < number; i++) {
                // Check if the number is divisible by any number other than 1 and itself
                if (number % i == 0) {
                    isPrime = false;  // Set isPrime to false if divisible by i
                    break;  // Break out of the loop as it's not a prime number
                }
            }

            // Output the result
            if (isPrime) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        } else {
            System.out.println("Please enter a number greater than 1.");
        }

        // Close the scanner
        scanner.close();
    }
}
