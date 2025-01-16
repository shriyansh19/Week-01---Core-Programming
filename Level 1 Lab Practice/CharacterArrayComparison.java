import java.util.Scanner;
import java.util.Arrays; 

// Class to demonstrate substring creation using manual and built-in methods
class CharacterArrayComparison {

    // Method to create a character array without using built-in methods
    public static char[] createCharacterArrayWithoutInBuiltMethod(String str) {
        char[] charArray = new char[str.length()]; // Create a character array with the length of the string
        
        // Copy each character of the string into the array
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        
        return charArray; // Return the manually created character array
    }

    // Method to compare two character arrays
    public static boolean compareCharArray(String str) {
        // Create character array using built-in method
        char[] charArrayUsingBuilIn = str.toCharArray();
        
        // Create character array using manual method
        char[] charArrayWithoutUsingBuilIn = createCharacterArrayWithoutInBuiltMethod(str);
        
        // Print the character arrays for debugging
        System.out.println(new String(charArrayUsingBuilIn));
        System.out.println(new String(charArrayWithoutUsingBuilIn));
        
        // Use Arrays.equals() to compare the contents of the two arrays
        return Arrays.equals(charArrayUsingBuilIn, charArrayWithoutUsingBuilIn);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        // Ask the user to enter a string
        System.out.print("Enter the String: ");
        String str = input.next(); // Read the input string

        // Compare the character arrays and print the result
        System.out.println("Character Array match: " + compareCharArray(str));

        input.close(); // Close the Scanner object to release resources
    }
}
