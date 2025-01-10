import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop to find and print the factors of the number
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i); // Print factor if divisible
            }
        }

        // Close the scanner
        scanner.close();
    }
}
