import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Step 2: Create a multi-dimensional array to store height, weight, and BMI
        // Each row represents a person: [0] = height, [1] = weight, [2] = BMI
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatuses = new String[numberOfPersons];

        // Step 3: Take input for height and weight of each person
        for (int i = 0; i < numberOfPersons; i++) 
		{
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            personData[i][0] = scanner.nextDouble(); // Height

            System.out.print("Enter weight (in kilograms) of person " + (i + 1) + ": ");
            personData[i][1] = scanner.nextDouble(); // Weight

            // Validate input for positive height and weight
            if (personData[i][0] <= 0 || personData[i][1] <= 0) 
			{
                System.out.println("Error: Height and weight must be positive values.");
                return; // Exit the program if invalid input is encountered
            }
        }

        // Step 4: Calculate BMI and determine weight status for each person
        for (int i = 0; i < numberOfPersons; i++) 
		{
            // BMI = weight / (height * height)
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) 
			weightStatuses[i] = "Underweight";
			else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) 
			weightStatuses[i] = "Normal";
			else if (personData[i][2] >= 25.0 && personData[i][2] <= 29.9) 
			weightStatuses[i] = "Overweight";
			else 
			weightStatuses[i] = "Obese";
        }

        // Step 5: Display the height, weight, BMI, and weight status for each person
        System.out.println("\nPerson\tHeight (m)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < numberOfPersons; i++) 
		System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatuses[i]);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
