import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year >= 1582) && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check and display if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } 
		else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
