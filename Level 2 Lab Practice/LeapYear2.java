import java.util.Scanner;

public class LeapYear2 {

    public static void main(String[] args) {
        // Scanner to take year input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Using a single if statement with logical operators
        if (year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            // If the year is less than 1582, it is not a valid input for the Gregorian calendar
            System.out.println("Year must be greater than or equal to 1582.");
        }

        // Close the scanner
        scanner.close();
    }
}
