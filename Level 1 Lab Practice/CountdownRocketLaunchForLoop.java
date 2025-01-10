import java.util.Scanner;

public class CountdownRocketLaunchForLoop {
    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking input for countdown start value
        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();

        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
