import java.util.Scanner;

public class BMI {

    // Method to calculate BMI for each person
    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double heightInMeters = personData[i][1] / 100.0; // Convert cm to meters
            personData[i][2] = personData[i][0] / (heightInMeters * heightInMeters); // BMI Calculation
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][3]; // 2D array: weight, height, BMI
        String[] bmiStatus = new String[10];

        // Input data for 10 people
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            personData[i][0] = scanner.nextDouble(); // Weight
            System.out.print("Height (in cm): ");
            personData[i][1] = scanner.nextDouble(); // Height in cm
        }

        calculateBMI(personData); // Calculate BMI for each person
        bmiStatus = determineBMIStatus(personData); // Determine BMI status

        // Display the results
        System.out.println("\n--- BMI Results ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }
        scanner.close();
    }
}