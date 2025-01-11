import java.util.Scanner;

public class NumberChecker3 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // Number is divisible by a factor other than 1 and itself
            }
        }
        return true; // Number is prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number; // Calculate square of the number
        int sumOfDigits = 0;

        // Calculate the sum of digits of the square
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == number; // Check if the sum of digits equals the original number
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;

        // Calculate the sum and product of the digits
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        return sum == product; // Check if sum equals product
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number; // Calculate square of the number

        // Check if the square ends with the original number
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        // A buzz number is divisible by 7 or ends with 7
        return (number % 7 == 0) || (number % 10 == 7);
    }

    // Main method to demonstrate the utility class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        System.out.println("Is Prime: " + isPrime(number));

        // Check if the number is a neon number
        System.out.println("Is Neon: " + isNeon(number));

        // Check if the number is a spy number
        System.out.println("Is Spy: " + isSpy(number));

        // Check if the number is an automorphic number
        System.out.println("Is Automorphic: " + isAutomorphic(number));

        // Check if the number is a buzz number
        System.out.println("Is Buzz: " + isBuzz(number));

        scanner.close(); // Close the scanner
    }
}
