import java.util.Scanner;

public class FizzBuzzWhile {

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive number
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Check if the entered number is positive
        if (number > 0) {
            int i = 1;  // Initialize loop counter
            // While loop to iterate from 1 to the entered number
            while (i <= number) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // If not divisible by 3 or 5, print the number
                else {
                    System.out.println(i);
                }
                i++;  // Increment the loop counter
            }
        } else {
            System.out.println("Please enter a positive number.");
        }

        // Close the scanner
        scanner.close();
    }
}
