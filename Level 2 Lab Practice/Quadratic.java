import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of a quadratic equation
    public static double[] findRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;  // Calculate delta
        
        // If delta is negative, there are no real roots
        if (delta < 0) {
            return new double[0];  // No real roots
        }
        
        // If delta is zero, there is one real root
        if (delta == 0) {
            double root = -b / (2.0 * a);  // One real root
            return new double[] {root};
        }
        
        // If delta is positive, calculate the two real roots
        double root1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        
        return new double[] {root1, root2};
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input values for a, b, and c
        System.out.print("Enter coefficient a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter coefficient b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter coefficient c: ");
        int c = scanner.nextInt();
        
        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);
        
        // Display the results
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } else {
            System.out.println("Two roots: " + roots[0] + " and " + roots[1]);
        }
        
        // Close the scanner
        scanner.close();
    }
}
