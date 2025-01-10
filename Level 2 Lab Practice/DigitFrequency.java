import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take the input for a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Step 2: Find the count of digits in the number
        String numberStr = Long.toString(Math.abs(number)); // Convert to string for digit extraction
        int length = numberStr.length();
        System.out.println("The number has " + length + " digits.");

        // Step 3: Extract digits and save them in an array
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) 
		{
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        // Step 4: Create a frequency array to calculate the frequency of each digit
        int[] frequency = new int[10]; // Array size 10 for digits 0-9
		
        for (int digit : digits)
		frequency[digit]++;

        // Step 5: Display the frequency of each digit
        System.out.println("\nFrequency of each digit in the number:");
		
        for (int i = 0; i < 10; i++)
		if (frequency[i] > 0)
		System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
