import java.util.Scanner;

public class YoungestAndTallestFriend {

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input for the ages and heights of the three friends
        System.out.print("Enter age of Amar: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter height of Amar: ");
        int amarHeight = scanner.nextInt();

        System.out.print("Enter age of Akbar: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter height of Akbar: ");
        int akbarHeight = scanner.nextInt();

        System.out.print("Enter age of Anthony: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter height of Anthony: ");
        int anthonyHeight = scanner.nextInt();

        // Find the youngest friend
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        if (youngestAge == amarAge) {
            System.out.println("The youngest friend is Amar.");
        } else if (youngestAge == akbarAge) {
            System.out.println("The youngest friend is Akbar.");
        } else {
            System.out.println("The youngest friend is Anthony.");
        }

        // Find the tallest friend
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        if (tallestHeight == amarHeight) {
            System.out.println("The tallest friend is Amar.");
        } else if (tallestHeight == akbarHeight) {
            System.out.println("The tallest friend is Akbar.");
        } else {
            System.out.println("The tallest friend is Anthony.");
        }

        // Close the scanner
        scanner.close();
    }
}
