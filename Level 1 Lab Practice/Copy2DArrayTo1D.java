import java.util.Scanner;

class Copy2DArrayTo1D {
    public static void main(String args[]) 
	{
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        
        // Create a 2D array (Matrix) with the specified rows and columns
        int[][] matrix = new int[rows][columns];
        
        // Taking user input for the elements of the 2D array
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < columns; j++) 
			{
                System.out.print("Enter element for matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Create a 1D array to store the elements of the 2D array
        int[] array = new int[rows * columns];
        
        // Define an index variable for the 1D array
        int index = 0;
        
        // Copy elements of the 2D array into the 1D array
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < columns; j++) 
			{
                array[index] = matrix[i][j];
                index++; // Increment the index for the 1D array
            }
        }
        
        // Display the 1D array after copying the elements
        System.out.println("The elements in the 1D array are:");
        for (int i = 0; i < array.length; i++)
		System.out.print(array[i] + " ");
        
        System.out.println(); // Move to the next line
        
        // Close the scanner object
        input.close();
    }
}
