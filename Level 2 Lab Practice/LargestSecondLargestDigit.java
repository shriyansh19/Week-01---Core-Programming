import java.util.Scanner;

class LargestSecondLargestDigit {
    public static void main(String args[]) {
        // Create scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Initial size for the array and index variable
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Extract digits of the number and store them in the array
        while (number != 0) 
		{
            if (index == maxDigit) 
			{
                maxDigit += 10; // Increase the size of the array
                int[] temp = new int[maxDigit]; // Create a new array of increased size
				
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy old array to new array
				
                digits = temp; // Assign new array to digits
            }
            digits[index] = number % 10; // Extract the last digit
            number /= 10; // Remove the last digit from the number
            index++; // Increment index
        }
        
        // Find the largest and second largest digits
        int largest = -1, secondLargest = -1;
        
        for (int i = 0; i < index; i++) 
		{
            if (digits[i] > largest) 
			{
                secondLargest = largest;
                largest = digits[i];
            } 
			else if (digits[i] > secondLargest && digits[i] != largest)
            secondLargest = digits[i];
        }
        
        // Display the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        
        // Close the scanner
        input.close();
    }
}
