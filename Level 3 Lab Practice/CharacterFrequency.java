import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static void findFrequency(String text) {
        int len = text.length();
        boolean[] visited = new boolean[len]; // Track visited characters

        for (int i = 0; i < len; i++) {
            if (visited[i]) continue;

            char currentChar = text.charAt(i);
            int count = 1;

            // Count frequency of the current character
            for (int j = i + 1; j < len; j++) {
                if (text.charAt(j) == currentChar) {
                    count++;
                    visited[j] = true; // Mark as visited
                }
            }

            // Display character and its frequency
            System.out.println(currentChar + " -> " + count);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Character frequencies:");
        findFrequency(input);
    }
}
