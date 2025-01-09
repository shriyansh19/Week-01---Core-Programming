import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Sides of the triangular park
        System.out.print("Enter side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate perimeter
        double perimeter = side1 + side2 + side3;

        // Calculate number of rounds
        double totalDistance = 5000; // 5 km = 5000 meters
        int rounds = (int) Math.ceil(totalDistance / perimeter);

        // Output: Number of rounds
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
