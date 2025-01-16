import java.util.Scanner;

// Class to demonstrate substring creation using manual and built-in methods
class SubstringComparison {

    // Method to create a substring manually using charAt()
    public static String createSubstringUsingCharAt(String str, int startingIndex, int endingIndex) {
        String substr = ""; // Initialize an empty string to store the substring
        
        // Loop through the string from startingIndex to endingIndex (exclusive)
        for (int i = startingIndex; i < endingIndex; i++) {
            substr += str.charAt(i); // Append each character to the substring
        }
        
        return substr; // Return the manually created substring
    }

    // Method to create a substring using the built-in substring() method
    public static String createSubstringUsingSubstring(String str, int startingIndex, int endingIndex) {
        // Use the built-in substring method to extract the substring
        return str.substring(startingIndex, endingIndex);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        // Ask the user to enter a string
        System.out.print("Enter the String: ");
        String str = input.next(); // Read the input string

        // Ask the user to enter the starting index of the substring
        System.out.print("Enter the starting index: ");
        int startingIndex = input.nextInt(); // Read the starting index

        // Ask the user to enter the ending index of the substring
        System.out.print("Enter the ending index: ");
        int endingIndex = input.nextInt(); // Read the ending index

        // Create a substring manually using the charAt() method
        String substrUsingCharAt = createSubstringUsingCharAt(str, startingIndex, endingIndex);

        // Create a substring using the built-in substring() method
        String substrUsingBuiltIn = createSubstringUsingSubstring(str, startingIndex, endingIndex);

        // Display the substring created using the charAt() method
        System.out.println("Result using charAt(): " + substrUsingCharAt);

        // Display the substring created using the built-in substring() method
        System.out.println("Result using substring(): " + substrUsingBuiltIn);

        // Compare the two substrings and display if they match
        System.out.println("Substrings match: " + substrUsingBuiltIn.equals(substrUsingCharAt));

        input.close(); // Close the Scanner object to release resources
    }
}
