import java.util.Scanner;

class NumberTypeChecker {
    public static void main(String args[]) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Declare an array to hold 5 integers
        int[] number = new int[5];
        
        // Loop through the array to input and check the type of each number
        for (int i = 0; i < number.length; i++) 
		{
            System.out.print("Enter the number: ");
            // Take input from the user
            number[i] = input.nextInt();
            
            // Check if the number is negative
            if (number[i] < 0) 
			{
                System.out.println("The number " + number[i] + " is a negative number");
            } 
			else 
			{
                // Check if the number is odd or even
                if (number[i] % 2 != 0)
                // Number is odd
                System.out.println("The number " + number[i] + " is an odd positive number");
                else
                // Number is even
                System.out.println("The number " + number[i] + " is an even positive number");
                
            }
        }
        
        // Close the scanner object
        input.close();
    }
}
