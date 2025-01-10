import java.util.Scanner;

class YoungestTallestFriends {
    public static void main(String args[]) 
	{
        // Create scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Create arrays to store age and height of 3 friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
        
        // Get user input for age and height
        for (int i = 0; i < 3; i++) 
		{
            System.out.print(friends[i] + " - Enter age: ");
            age[i] = input.nextInt();
			
            System.out.print(friends[i] + " - Enter height: ");
            height[i] = input.nextDouble();
        }
        
        // Variables to store the youngest and tallest friend
        int youngestIndex = 0, tallestIndex = 0;
        
        // Loop through the arrays to find the youngest and tallest
        for (int i = 1; i < 3; i++) 
		{
            if (age[i] < age[youngestIndex])
			youngestIndex = i;
			
            if (height[i] > height[tallestIndex]) 
			tallestIndex = i;
        }
        
        // Display the youngest and tallest friend
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] + " with age " + age[youngestIndex]);
        System.out.println("The tallest friend is " + friends[tallestIndex] + " with height " + height[tallestIndex]);
        
        // Close the scanner
        input.close();
    }
}
