import java.util.Scanner;

class NumberStorage {
    public static void main(String args[]) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Declare an array to store up to 10 elements of type double
        double[] numbers = new double[10];
        
        // Variable to store the total sum, initialized to 0.0
        double total = 0.0;
        
        // Index variable to keep track of array elements
        int index = 0;
        
        // Infinite loop to take user input until the conditions are met
        while (true) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();
            
            // Check if the entered number is 0 or negative, or if the array is full
            if (num <= 0 || index == 10)
            reak;  // Exit the loop if the number is 0 or negative or array size exceeds 10
            
            
            // Store the entered number in the array and increment the index
            numbers[index] = num;
            index++;
        }
        
        // Calculate the total sum of the numbers stored in the array
        for (int i = 0; i < index; i++)
        total += numbers[i];
        
        // Display the numbers stored in the array and the total sum
        System.out.println("\nNumbers entered:");
		
        for (int i = 0; i < index; i++)
        System.out.println(numbers[i]);
        
        System.out.println("\nTotal sum: " + total);
        
        // Close the scanner object
        input.close();
    }
}
