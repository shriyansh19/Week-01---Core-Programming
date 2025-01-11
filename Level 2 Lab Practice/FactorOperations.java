import java.util.Scanner;

public class FactorOperations {

    // Method to find factors of a number and return them in an array
    public static int[] findFactors(int num) {
        int count = 0;

        // Count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count]; // Initialize array for factors
        int index = 0;

        // Populate the array with factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors; // Return the factors array
    }

    // Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of the square of factors
    public static int sumOfSquareOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2); // Square each factor
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Find factors and perform calculations
        int[] factors = findFactors(num);
        System.out.print("Factors of " + num + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\nSum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquareOfFactors(factors));
    }
}
