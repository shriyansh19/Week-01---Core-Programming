import java.util.Scanner;

class FizzBuzz {
    public static void main(String args[]) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Create a String array to store the results
		// Array size = number + 1 to include 0 to the number
        String[] results = new String[number + 1]; 
        
        // Loop from 1 to the number and calculate Fizz, Buzz, or FizzBuzz
        for (int i = 1; i <= number; i++) 
		{
            if (i % 3 == 0 && i % 5 == 0)
			results[i] = "FizzBuzz"; 
			else if (i % 3 == 0) 
			results[i] = "Fizz";
			else if (i % 5 == 0) 
			results[i] = "Buzz";
			else
			results[i] = Integer.toString(i);
        }
        
        // Display the results in the required format
        for (int i = 1; i <= number; i++)
        System.out.println("Position " + i + " = " + results[i]);
        
        // Close the scanner object
        input.close();
    }
}
