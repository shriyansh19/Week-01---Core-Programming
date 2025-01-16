import java.util.Scanner;

public class WordsWithLengths {

    // Method to split text into words using custom logic
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

    // Method to calculate length of each word
    public static String[][] wordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        // Split text and calculate lengths
        String[] words = customSplit(text);
        String[][] wordDetails = wordLengths(words);

        // Display in tabular format
        System.out.println("Word\tLength");
        for (String[] detail : wordDetails) {
            System.out.println(detail[0] + "\t" + Integer.parseInt(detail[1]));
        }
    }
}
