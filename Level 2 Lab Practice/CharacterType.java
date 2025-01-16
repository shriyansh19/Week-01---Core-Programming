import java.util.Scanner;

public class CharacterType {

    // Method to classify character
    public static String classifyCharacter(char c) {
        if (Character.isLetter(c)) {
            if (isVowel(c)) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char c) {
        char lower = Character.toLowerCase(c);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }

    // Method to classify all characters in a string
    public static String[][] classifyString(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = classifyCharacter(text.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string:");
        String text = scanner.nextLine();

        // Classify characters
        String[][] classifications = classifyString(text);

        // Display in tabular format
        System.out.println("Character\tType");
        for (String[] pair : classifications) {
            System.out.println(pair[0] + "\t\t" + pair[1]);
        }
    }
}
