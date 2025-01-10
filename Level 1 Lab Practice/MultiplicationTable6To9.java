import java.util.Scanner;

class MultiplicationTable6To9 {
    public static void main(String args[]) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Get the number for which we need to print the multiplication table
        System.out.print("Enter a number (6 to 9): ");
        int number = input.nextInt();
        
        // Check if the number is in the valid range
        if (number < 6 || number > 9) {
            System.out.println("Invalid input! Please enter a number between 6 and 9.");
        } else {
            // Define an array to store the multiplication results
            int[] multiplicationResult = new int[10];
            
            // Loop through 1 to 10 to calculate the multiplication results for the entered number
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[i - 1] = number * i;  // Store the result in the array
            }
            
            // Display the multiplication table
            System.out.println("\nMultiplication table of " + number + ":");
            for (int i = 0; i < 10; i++) {
                System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
            }
        }
        
        // Close the scanner object
        input.close();
    }
}
