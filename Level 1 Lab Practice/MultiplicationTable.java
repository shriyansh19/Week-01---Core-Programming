import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking input for number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
