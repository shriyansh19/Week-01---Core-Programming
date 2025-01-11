import java.util.Scanner;

public class NumberChecker4 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;

        // Count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 2]; // Second last element (excluding the number itself)
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors
    public static int productOfCubesOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Cube of each factor
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number, int[] factors) {
        int sum = sumOfFactors(factors) - number; // Exclude the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number, int[] factors) {
        int sum = sumOfFactors(factors) - number; // Exclude the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number, int[] factors) {
        int sum = sumOfFactors(factors) - number; // Exclude the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int originalNumber = number;

        // Calculate the sum of the factorial of the digits
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber; // Check if the sum equals the original number
    }

    // Helper method to calculate the factorial of a digit
    private static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find factors of the number
        int[] factors = findFactors(number);

        // Display the results
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number, factors));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number, factors));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number, factors));
        System.out.println("Is Strong Number: " + isStrongNumber(number));

        scanner.close(); // Close the scanner
    }
}
