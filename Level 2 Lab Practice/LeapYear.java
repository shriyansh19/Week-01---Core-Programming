import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // Scanner to take year input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is valid (greater than or equal to 1582)
        if (year >= 1582) {
            // If the year is divisible by 4
            if (year % 4 == 0) {
                // If the year is divisible by 100
                if (year % 100 == 0) {
                    // If the year is divisible by 400, it is a leap year
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    // If the year is divisible by 4 but not 100, it is a leap year
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                // If the year is not divisible by 4, it is not a leap year
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            // If the year is less than 1582, it is not a valid input for the Gregorian calendar
            System.out.println("Year must be greater than or equal to 1582.");
        }

        // Close the scanner
        scanner.close();
    }
}
