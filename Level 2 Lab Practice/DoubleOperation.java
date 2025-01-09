import java.util.Scanner;

public class DoubleOperation {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // Scanner for user input

        // Input values for a, b, and c
        System.out.print("Enter the value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value for c: ");
        double c = input.nextDouble();

        // Perform and display results of integer operations
        System.out.print("The results of Int Operations are " + 
                         (a + b * c) + ", " + 
                         (a * b + c) + ", " + 
                         (c + a / b) + " and " + 
                         (a % b + c));
    }
}
