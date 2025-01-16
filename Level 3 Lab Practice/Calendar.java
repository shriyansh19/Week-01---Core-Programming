import java.util.Scanner;

public class Calendar {

    // Array to store the names of the months
    private static final String[] MONTHS = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Validate month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a month between 1 and 12.");
            return;
        }

        // Get the name of the month
        String monthName = getMonthName(month);

        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);

        // Get the day of the week for the first day of the month
        int firstDayOfWeek = getFirstDayOfWeek(month, year);

        // Display the calendar header
        System.out.println(" " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Display the calendar body
        int dayOfWeek = 0; // Start with Sunday
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("    "); // Indent for days before the first day of the month
            dayOfWeek++;
        }

        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("%3d ", i); // Print the day with proper indentation
            dayOfWeek++;

            if (dayOfWeek == 7) { // If it's Saturday, move to the next line
                System.out.println();
                dayOfWeek = 0;
            }
        }

        System.out.println();
    }

    // Method to get the name of the month
    private static String getMonthName(int month) {
        return MONTHS[month - 1];
    }

    // Method to get the number of days in the month
    private static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return DAYS_IN_MONTH[month - 1];
        }
    }

    // Method to check if it's a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the day of the week for the first day of the month
    // using the Gregorian calendar algorithm
    private static int getFirstDayOfWeek(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        return d0;
    }
}