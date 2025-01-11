import java.util.Scanner;

public class PointOperations {

    // Method to find the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;
    }

    // Method to find the equation of a line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] lineEquation = new double[2];
        double slope = (y2 - y1) / (x2 - x1); // Calculate the slope (m)
        double yIntercept = y1 - (slope * x1); // Calculate the y-intercept (b)

        lineEquation[0] = slope;     // Store slope in the array
        lineEquation[1] = yIntercept; // Store y-intercept in the array

        return lineEquation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for the coordinates of the two points
        System.out.print("Enter the coordinates of the first point (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter the coordinates of the second point (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculate the Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between the points: %.2f%n", distance);

        // Find the equation of the line
        if (x1 != x2) { // Ensure the line is not vertical
            double[] lineEquation = findLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of the line: y = %.2fx + %.2f%n", lineEquation[0], lineEquation[1]);
        } else {
            System.out.println("The line is vertical, equation: x = " + x1);
        }

        scanner.close(); // Close the scanner
    }
}
