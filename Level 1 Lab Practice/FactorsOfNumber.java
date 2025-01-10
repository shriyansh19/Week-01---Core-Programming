import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String args[]) 
	{
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Initialize the max factor size and the factors array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0; // Index to track where to store the factors
        
        // Loop through numbers from 1 to the entered number to find factors
        for (int i = 1; i <= number; i++) 
		{
            if (number % i == 0) 
			{ // If i is a factor of the number
                // Check if the factors array is full
                if (index == maxFactor) 
				{
                    // Double the size of the factors array and copy old values to the new array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; // Reassign the factors array to the new temp array
                }
                factors[index] = i; // Store the factor in the array
                index++; // Increment the index
            }
        }
        
        // Display the factors of the number
        System.out.print("Factors of " + number + ": ");
		
        for (int i = 0; i < index; i++)
        System.out.print(factors[i] + " ");
        
        System.out.println(); // Move to the next line
        
        // Close the scanner object
        input.close();
    }
}
