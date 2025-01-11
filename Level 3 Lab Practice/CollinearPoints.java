import java.util.Scanner;

public class CollinearPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking inputs for the three points (x1, y1), (x2, y2), (x3, y3)
        System.out.println("Enter x1, y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter x2, y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Enter x3, y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Checking collinearity using the slope formula
        boolean collinearSlope = areCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Checking collinearity using the area of a triangle formula
        boolean collinearArea = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Displaying the results
        if (collinearSlope && collinearArea) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }

        scanner.close();
    }

    // Method to check collinearity using the slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the slopes
        int slopeAB = (y2 - y1) * (x3 - x2);
        int slopeBC = (y3 - y2) * (x2 - x1);

        // Check if the slopes are equal
        return slopeAB == slopeBC;
    }

    // Method to check collinearity using the area of a triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area of the triangle
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);

        // Check if the area is zero
        return area == 0;
    }
}
