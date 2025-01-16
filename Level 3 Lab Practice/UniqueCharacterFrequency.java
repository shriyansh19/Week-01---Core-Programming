import java.util.Scanner;

public class UniqueCharacterFrequency {

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text) {
        int len = text.length();
        char[] uniqueChars = new char[len];
        int uniqueIndex = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueIndex++] = currentChar;
            }
        }

        char[] result = new char[uniqueIndex];
        for (int i = 0; i < uniqueIndex; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    // Method to find frequency of unique characters
    public static void findUniqueFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text);

        for (char uniqueChar : uniqueChars) {
            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == uniqueChar) {
                    count++;
                }
            }

            System.out.println(uniqueChar + " -> " + count);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Unique character frequencies:");
        findUniqueFrequency(input);
    }
}
