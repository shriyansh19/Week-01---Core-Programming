import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter their weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();
        
        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        
        // Convert height from centimeters to meters
        double heightM = heightCm / 100.0;
        
        // Calculate the BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);
        
        // Determine the weight status based on the BMI value
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Display the BMI and the weight status to the user
        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
        
        // Close the Scanner object
        input.close();
    }
}
