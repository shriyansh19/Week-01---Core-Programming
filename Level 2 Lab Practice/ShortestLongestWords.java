import java.util.Scanner;

public class ShortestLongestWords {

    // Method to split text into words
    public static String[] customSplit(String text) {
        int count = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        int start = 0, index = 0;
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        // Split text and find shortest and longest words
        String[] words = customSplit(text);
        String[] results = findShortestLongest(words);

        // Display results
        System.out.println("Shortest Word: " + results[0]);
        System.out.println("Longest Word: " + results[1]);
    }
}
