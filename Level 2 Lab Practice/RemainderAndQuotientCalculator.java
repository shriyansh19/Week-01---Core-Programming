import java.util.Scanner;

public class RemainderAndQuotientCalculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // Scanner for user input

        System.out.print("Enter the number1 value: ");
        int number1 = input.nextInt(); // Input for the first number

        System.out.print("Enter the number2 value: ");
        int number2 = input.nextInt(); // Input for the second number

        // Calculate and display quotient and remainder
        System.out.println("The Quotient is " + (number1 / number2) +
                           " and Reminder is " + (number1 % number2) +
                           " of two numbers " + number1 + " and " + number2);
    }
}
