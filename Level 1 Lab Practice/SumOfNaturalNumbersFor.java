import java.util.Scanner;

public class SumOfNaturalNumbersFor {
    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number > 0) {
            // Calculate sum using formula
            int sumFormula = number * (number + 1) / 2;

            // Calculate sum using for loop
            int sumFor = 0;
            for (int i = 1; i <= number; i++) {
                sumFor += i;
            }

            // Display results and compare both methods
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);

            // Check if both sums are correct
            if (sumFormula == sumFor) {
                System.out.println("Both results are correct!");
            } else {
                System.out.println("The results do not match.");
            }
        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}
