import java.util.Scanner;

// Class to demonstrate uppercase string conversion using manual and built-in methods
public class StringUppercaseComparison {

    // Method to convert a string to uppercase without using built-in methods
    public static String uppercaseConversionWithoutInBuilt(String str) {
        String uppercaseStr = ""; // Initialize an empty string to store the uppercase result

        // Iterate through each character of the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the character at the current index

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Convert the lowercase letter to uppercase by subtracting 32
                uppercaseStr += (char) (ch - 32);
            } else {
                // If the character is not a lowercase letter, add it as is
                uppercaseStr += ch;
            }
        }

        return uppercaseStr; // Return the manually converted uppercase string
    }

    // Method to compare two uppercase strings
    public static boolean compareBothUppercase(String uppercaseWithoutInBuilt, String uppercaseUsingInBuilt) {
        // Use the equals() method to compare the content of the two strings
        return uppercaseUsingInBuilt.equals(uppercaseWithoutInBuilt);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string
        System.out.print("Enter the string: ");
        String str = scanner.nextLine(); // Read the input string

        // Convert the string to uppercase without using built-in methods
        String uppercaseWithoutInBuilt = uppercaseConversionWithoutInBuilt(str);

        // Convert the string to uppercase using the built-in method
        String uppercaseUsingInBuilt = str.toUpperCase();

        // Display the results of both conversions
        System.out.println("Uppercase without built-in method: " + uppercaseWithoutInBuilt);
        System.out.println("Uppercase using built-in method: " + uppercaseUsingInBuilt);

        // Compare the results and display if they match
        System.out.println("Results match: " + compareBothUppercase(uppercaseUsingInBuilt, uppercaseWithoutInBuilt));

        scanner.close(); // Close the Scanner object to release resources
    }
}
