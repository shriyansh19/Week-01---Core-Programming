import java.util.Scanner;

class FootballTeamMeanHeight 
{
    public static void main(String args[]) 
	{
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Create an array to store the heights of 11 players
        double[] heights = new double[11];
        
        // Variable to store the sum of all heights
        double sum = 0.0;
        
        // Get the height of each player and calculate the sum
        for (int i = 0; i < heights.length; i++) 
		{
            System.out.print("Enter the height of player " + (i + 1) + ": ");
			
            heights[i] = input.nextDouble();
            sum += heights[i];  // Add the height to the sum
        }
        
        // Calculate the mean height by dividing the sum by 11
        double meanHeight = sum / heights.length;
        
        // Display the mean height of the football team
        System.out.println("The mean height of the football team is: " + meanHeight);
        
        // Close the scanner object
        input.close();
    }
}
