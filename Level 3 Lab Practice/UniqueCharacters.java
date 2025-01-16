import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of a string without using the built-in length() method
    public static int findLength(String text) {
        int length = 0;
        try {
            while (text.charAt(length) != '\0') {
                length++;
            }
        } catch (Exception e) {
            // Exception occurs when index is out of bounds, indicating end of string
        }
        return length;
    }

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int len = findLength(text);
        char[] uniqueChars = new char[len]; // Array to store unique characters
        int uniqueIndex = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character has already appeared in the string
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        // Trim the array to the number of unique characters found
        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Finding unique characters
        char[] uniqueChars = findUniqueCharacters(inputText);

        // Displaying the result
        System.out.print("Unique characters in the string: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
    }
}
