import java.util.Scanner;

// Class to demonstrate lowercase string conversion using manual and built-in methods
public class StringLowercaseComparison {

    // Method to convert a string to lowercase without using built-in methods
    public static String lowercaseConversionWithoutInBuilt(String str) {
        String lowercaseStr = ""; // Initialize an empty string to store the lowercase result

        // Iterate through each character of the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at the current index

            // Check if the character is an uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                // Convert the uppercase letter to lowercase by adding 32
                lowercaseStr += (char) (ch + 32);
            } else {
                // If the character is not an uppercase letter, add it as is
                lowercaseStr += ch;
            }
        }

        return lowercaseStr; // Return the manually converted lowercase string
    }

    // Method to compare two lowercase strings
    public static boolean compareBothLowercase(String lowercaseWithoutInBuilt, String lowercaseUsingInBuilt) {
        // Use the equals() method to compare the content of the two strings
        return lowercaseUsingInBuilt.equals(lowercaseWithoutInBuilt);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string
        System.out.print("Enter the string: ");
        String str = scanner.nextLine(); // Read the input string

        // Convert the string to lowercase without using built-in methods
        String lowercaseWithoutInBuilt = lowercaseConversionWithoutInBuilt(str);

        // Convert the string to lowercase using the built-in method
        String lowercaseUsingInBuilt = str.toLowerCase();

        // Display the results of both conversions
        System.out.println("Lowercase without built-in method: " + lowercaseWithoutInBuilt);
        System.out.println("Lowercase using built-in method: " + lowercaseUsingInBuilt);

        // Compare the results and display if they match
        System.out.println("Results match: " + compareBothLowercase(lowercaseUsingInBuilt, lowercaseWithoutInBuilt));

        scanner.close(); // Close the Scanner object to release resources
    }
}
