import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoop {

    // Method to find the frequency of characters
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert string to char array
        int[] frequencies = new int[characters.length]; // Array to store frequencies
        int n = characters.length;

        // Initialize all frequencies to -1
        for (int i = 0; i < n; i++) {
            frequencies[i] = -1;
        }

        // Find frequency of each character
        for (int i = 0; i < n; i++) {
            if (characters[i] != '0') { // Skip already processed characters
                int count = 1; // Frequency starts from 1
                for (int j = i + 1; j < n; j++) {
                    if (characters[i] == characters[j]) {
                        count++;
                        characters[j] = '0'; // Mark duplicate as processed
                    }
                }
                frequencies[i] = count; // Store frequency
            }
        }

        // Create a result array to store characters and their frequencies
        int uniqueCount = 0;
        for (int freq : frequencies) {
            if (freq != -1) uniqueCount++;
        }

        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (frequencies[i] != -1) {
                result[index++] = characters[i] + " -> " + frequencies[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find frequency of characters
        String[] frequencies = findCharacterFrequency(text);

        // Display the results
        System.out.println("Character frequencies:");
        for (String frequency : frequencies) {
            System.out.println(frequency);
        }
    }
}
