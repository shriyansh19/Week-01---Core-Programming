import java.util.Scanner;

public class NaturalNumbersSum {

    // Recursive method to find the sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to calculate the sum using the formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Not a natural number.");
            return;
        }

        // Calculate sums
        int sumRec = sumUsingRecursion(n);
        int sumForm = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);
        System.out.println("Both results match: " + (sumRec == sumForm));
    }
}
