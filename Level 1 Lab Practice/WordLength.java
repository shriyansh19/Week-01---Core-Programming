import java.util.Scanner;

public class WordLength {
    // Splits the text into an array of words
    public static String[] splitText(String text) {
        String[] words = new String[countWords(text)]; 
        int wordCount = 0;
		int start = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isWhitespace(c)) { 
                if (start != i) { 
                    words[wordCount++] = text.substring(start, i);
                }
                start = i + 1; 
            }
        }

        if (start != text.length()) { 
            words[wordCount] = text.substring(start);
        }

        return words;
    }

    // Counts the number of words in the text
    public static int countWords(String text) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isWhitespace(c)) {
                inWord = false;
            } else if (!inWord) {
                count++;
                inWord = true;
            }
        }

        return count;
    }

    // Finds the length of a given string
    public static int stringLength(String word) {
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            length++;
        }
        return length;
    }

    // Creates a 2D array containing words and their lengths
    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(stringLength(words[i])); 
        }
        return wordLengths;
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordLengths = getWordLengths(words);

        System.out.println("Word\tLength");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }

        scanner.close();
    }
}