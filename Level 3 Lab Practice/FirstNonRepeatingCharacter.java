import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeating(String text) {
        int len = text.length();
        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isRepeating = false;

            // Check if the character repeats
            for (int j = 0; j < len; j++) {
                if (i != j && text.charAt(j) == currentChar) {
                    isRepeating = true;
                    break;
                }
            }

            // Return the first non-repeating character
            if (!isRepeating) {
                return currentChar;
            }
        }
        return '\0'; // Return null character if no non-repeating character exists
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findFirstNonRepeating(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
