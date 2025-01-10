import java.util.Scanner;

class OddEvenArrays {
    public static void main(String args[]) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Get the number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Check if the number is a natural number (greater than 0)
        if (number <= 0)
		{
            System.out.println("Error: Please enter a natural number greater than 0.");
            input.close();
            return; // Exit the program if the input is invalid
        }
        
        // Create arrays for odd and even numbers
        int[] oddNumbers = new int[number / 2 + 1]; // Size is number / 2 + 1
        int[] evenNumbers = new int[number / 2 + 1];
        
        // Index variables for odd and even arrays
        int oddIndex = 0, evenIndex = 0;
        
        // Loop through the numbers from 1 to the entered number
        for (int i = 1; i <= number; i++) 
		{
            if (i % 2 == 0) 
			{
                // If the number is even, store it in the evenNumbers array
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } 
			else 
			{
                // If the number is odd, store it in the oddNumbers array
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        
        // Print the odd numbers array
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++)
        System.out.print(oddNumbers[i] + " ");
        
        System.out.println(); // Move to the next line
        
        // Print the even numbers array
        System.out.print("Even numbers: ");
		
        for (int i = 0; i < evenIndex; i++)
        System.out.print(evenNumbers[i] + " ");
        
        System.out.println(); // Move to the next line
        
        // Close the scanner object
        input.close();
    }
}
