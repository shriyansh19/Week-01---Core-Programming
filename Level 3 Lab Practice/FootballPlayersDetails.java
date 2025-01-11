import java.util.Scanner;

class FootballPlayersDetails {
    // Method to calculate the sum of all players' heights
    public double sumOfPlayersHeights(double[] playersHeights) {
        double sum = 0.0;
        
        // Iterating through the array and adding each height to the sum
        for (double height : playersHeights)
        sum += height;
        
        return sum; // Returning the total sum
    }
    
    // Method to calculate the mean (average) of players' heights
    public double meanOfPlayersHeights(double[] playersHeights) {
        // Calculate the total sum of heights
        double sum = sumOfPlayersHeights(playersHeights);
        // Compute mean by dividing the sum by the number of players
        double mean = sum / playersHeights.length;
        
        return mean; // Returning the mean height
    }
    
    // Method to find the tallest player's height
    public double tallestHeightofPlayer(double[] playersHeights) {
        double tallest = 0.0; // Initialize with the smallest possible value
        
        // Iterating through the array to find the maximum height
        for (double height : playersHeights)
		tallest = Math.max(tallest, height);
        
        return tallest; // Returning the tallest height
    }
    
    // Method to find the shortest player's height
    public double shortestHeightofPlayer(double[] playersHeights) {
        double shortest = 251.0; // Initialize with a value greater than the expected range
        
        // Iterating through the array to find the minimum height
        for (double height : playersHeights)
		shortest = Math.min(shortest, height);
        
        return shortest; // Returning the shortest height
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // Creating a Scanner object to take input
        
        double[] playersHeights = new double[11]; // Array to store the heights of 11 players
        
        // Taking input for each player's height
        for (int i = 0; i < playersHeights.length; i++) {	
            while (true) 
			{
                System.out.print("Enter the height of player " + (i + 1) + ": ");
                playersHeights[i] = input.nextDouble(); // Reading the height
                
                // Validating the height input (should be between 150 cm and 250 cm)
                if (playersHeights[i] < 150 || playersHeights[i] > 250)
					System.out.println("Please enter the height of player between (150cm to 250cm).");
                else
                    break; // Exit the loop if the height is valid
            }
        }
        
        FootballPlayersDetails obj = new FootballPlayersDetails(); // Creating an object of the class
        
        // Printing the calculated statistics
        System.out.println("The sum of the heights of all the players is " + obj.sumOfPlayersHeights(playersHeights));
        System.out.println("The mean height of all the players is " + obj.meanOfPlayersHeights(playersHeights));
        System.out.println("The tallest player among all the players is " + obj.tallestHeightofPlayer(playersHeights));
        System.out.println("The shortest player among all the players is " + obj.shortestHeightofPlayer(playersHeights));
		
		input.close();
    }
}
