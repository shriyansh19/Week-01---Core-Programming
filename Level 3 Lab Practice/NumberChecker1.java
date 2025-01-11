import java.util.Scanner;

public class NumberChecker {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10; // Remove the last digit
            count++; // Increment the count
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number); // Get the number of digits
        int[] digits = new int[count]; // Create an array of appropriate size
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10; // Extract the last digit
            number = number / 10; // Remove the last digit
        }
        return digits;
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int number) {
        int[] digits = getDigitsArray(number); // Get the digits array
        int sum = 0;
        for (int digit : digits) {
            sum += digit; // Add each digit to the sum
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = getDigitsArray(number); // Get the digits array
        int sum = 0;
        for (int digit : digits) {
            sum += (int) Math.pow(digit, 2); // Square the digit and add to sum
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number); // Calculate the sum of digits
        return number % sum == 0; // Check divisibility
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number); // Get the digits array
        int[][] frequency = new int[10][2]; // Create a 2D array for frequencies

        // Initialize the 2D array with digit values
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // The digit
            frequency[i][1] = 0; // Initial frequency
        }

        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit][1]++; // Increment the frequency for the digit
        }
        return frequency;
    }

    // Main method to test the utility class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find and display the count of digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Store and display the digits of the number
        int[] digitsArray = getDigitsArray(number);
        System.out.print("Digits in the number: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Find and display the sum of the digits
        int sumDigits = sumOfDigits(number);
        System.out.println("Sum of digits: " + sumDigits);

        // Find and display the sum of the squares of the digits
        int sumSquares = sumOfSquaresOfDigits(number);
        System.out.println("Sum of squares of digits: " + sumSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find and display the frequency of each digit
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) { // Only display digits that occur
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }

        scanner.close(); // Close the scanner
    }
}
