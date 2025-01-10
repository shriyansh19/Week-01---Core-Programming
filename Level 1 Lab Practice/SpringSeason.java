import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        // Check if it's Spring Season (March 20 to June 20)
        if ((month > 3 || (month == 3 && day >= 20)) && (month < 6 || (month == 6 && day <= 20))) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
