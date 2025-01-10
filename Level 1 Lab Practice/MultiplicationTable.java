import java.util.Scanner;

class MultiplicationTable {
    public static void main(String args[]) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Get the number for which we need to print the multiplication table
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        
        // Define an integer array to store the multiplication table results (1 to 10)
        int[] table = new int[10];
        
        // Loop through 1 to 10 to calculate the multiplication results
        for (int i = 1; i <= 10; i++) 
		table[i - 1] = number * i;  // Store the result in the array
        
        // Display the multiplication table
        for (int i = 0; i < 10; i++)
		System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        
        
        // Close the scanner object
        input.close();
    }
}
