import java.util.*;

public class TrigonometricFunctions {
    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Converting angle to radians
        double radians = Math.toRadians(angle);

        // Calculating sine, cosine, and tangent
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        // Return results as an array
        return new double[]{sinValue, cosValue, tanValue};
    }

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the angle: ");
        double angle = input.nextDouble();

        // Calculating trigonometric functions
        double[] result = calculateTrigonometricFunctions(angle);

        // Output result
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
		
		input.close();
    }
}
