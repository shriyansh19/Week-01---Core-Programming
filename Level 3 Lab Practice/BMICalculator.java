import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create 2D array to store weight and height
        double[][] data = new double[10][2];

        // Get user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status for each person
        String[][] results = calculateBMIandStatus(data);

        // Display the results in tabular format
        displayResults(results);
    }

    // Method to calculate BMI and status for each person
    private static String[][] calculateBMIandStatus(double[][] data) {
        String[][] results = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100; // Convert cm to meters
            double bmi = weight / (height * height);

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            results[i][0] = String.valueOf(data[i][0]); // Weight
            results[i][1] = String.valueOf(data[i][1]); // Height
            results[i][2] = String.format("%.2f", bmi); // BMI
            results[i][3] = status;
        }

        return results;
    }

    // Method to display the results in tabular format
    private static void displayResults(String[][] results) {
        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "\t" + results[i][1] + "\t" + results[i][0] + "\t" + results[i][2] + "\t" + results[i][3]);
        }
    }
}