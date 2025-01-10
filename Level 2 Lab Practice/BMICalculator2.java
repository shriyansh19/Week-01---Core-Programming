import java.util.Scanner;

public class BMICalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // Step 2: Create a multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[numberOfPersons][3]; // [0] = height, [1] = weight, [2] = BMI
        String[] weightStatus = new String[numberOfPersons]; // Array to store weight status

        // Step 3: Take input for height and weight for each person
        for (int i = 0; i < numberOfPersons; i++) 
		{
            System.out.println("Enter details for person " + (i + 1) + ":");

            // Input and validate height
            do 
			{
                System.out.print("Height (in meters, positive value): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0)
                System.out.println("Error: Height must be a positive value.");
                
            } 
			while (personData[i][0] <= 0);

            // Input and validate weight
            do 
			{
                System.out.print("Weight (in kilograms, positive value): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0)
			    System.out.println("Error: Weight must be a positive value.");
                
            } 
			while (personData[i][1] <= 0);
        }

        // Step 4: Calculate BMI and determine weight status for each person
        for (int i = 0; i < numberOfPersons; i++) 
		{
            // BMI = weight / (height * height)
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) 
			weightStatus[i] = "Underweight";
			else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) 
			weightStatus[i] = "Normal";
            else if (personData[i][2] >= 25.0 && personData[i][2] <= 29.9)
			weightStatus[i] = "Overweight";
			else
			weightStatus[i] = "Obese";
        }

        // Step 5: Display height, weight, BMI, and weight status for each person
        System.out.println("\nPerson\tHeight (m)\tWeight (kg)\tBMI\t\tStatus");
		
        for (int i = 0; i < numberOfPersons; i++)
		System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
