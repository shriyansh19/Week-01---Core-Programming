import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number > 0) {
            System.out.println("Odd numbers:");
            for (int i = 1; i <= number; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }

            System.out.println("Even numbers:");
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("The number is not a valid positive integer.");
        }
    }
}
