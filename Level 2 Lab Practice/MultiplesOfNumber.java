
import java.util.Scanner;

public class MultiplesOfNumber {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input value for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop to find and print all multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i); // Print multiple if divisible
            }
        }

        // Close the scanner
        scanner.close();
    }
}

