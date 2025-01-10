import java.util.Scanner;

public class CountdownRocketLaunch {
    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking input for countdown start value
        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();

        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement the counter
        }
    }
}
