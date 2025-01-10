import java.util.Scanner;

class ReverseNumber {
    public static void main(String args[]) 
	{
        // Create scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Find the number of digits in the number
        int temp = number;
        int count = 0;
        
        while (temp != 0) 
		{
            temp /= 10;
            count++;
        }
        
        // Create an array to store the digits
        int[] digits = new int[count];
        
        // Extract digits and store them in the array
        temp = number;
		
        for (int i = 0; i < count; i++) 
		{
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        // Display the reversed number
        System.out.print("Reversed number: ");
		
        for (int i = 0; i < count; i++)
        System.out.print(digits[i]);
        
        // Close the scanner
        input.close();
    }
}
