import java.util.Scanner;

public class YoungestAndTallest {
    
    // Method to find the youngest friend
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngest = "Amar";
        
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngest = "Akbar";
        }
        if (ages[2] < minAge) {
            youngest = "Anthony";
        }
        
        return youngest;
    }
    
    // Method to find the tallest friend
    public static String findTallest(double[] heights) {
        double maxHeight = heights[0];
        String tallest = "Amar";
        
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallest = "Akbar";
        }
        if (heights[2] > maxHeight) {
            tallest = "Anthony";
        }
        
        return tallest;
    }
    
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Arrays to store ages and heights of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // Take user input for age and height of Amar, Akbar, and Anthony
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + (i == 0 ? "Amar: " : (i == 1 ? "Akbar: " : "Anthony: ")));
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + (i == 0 ? "Amar: " : (i == 1 ? "Akbar: " : "Anthony: ")));
            heights[i] = scanner.nextDouble();
        }
        
        // Find and display the youngest and tallest friend
        System.out.println("The youngest friend is " + findYoungest(ages));
        System.out.println("The tallest friend is " + findTallest(heights));
        
        // Close the scanner
        scanner.close();
    }
}
