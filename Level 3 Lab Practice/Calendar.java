import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        printCalendar(month, year);
        scanner.close();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    // Method to get the number of days in a given month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Method to get the first day of the month (0 = Sunday, 6 = Saturday)
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m < 3) {
            m += 12;
            y--;
        }

        int dayOfWeek = (1 + (13 * (m + 1)) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
        return (dayOfWeek + 6) % 7; // Adjusting to start from Sunday (0)
    }

    public static void printCalendar(int month, int year) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        System.out.println("\n" + monthNames[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Four spaces for alignment
        }

        // Print the days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println(); // Newline after Saturday
            }
        }
        System.out.println();
    }
}