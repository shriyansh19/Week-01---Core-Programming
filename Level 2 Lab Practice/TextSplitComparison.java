import java.util.Scanner;

public class TextSplitComparison {

    // Method to find the length of a string without using built-in length() method
    public static int findLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String text) {
        int count = 1; // At least one word exists
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        String[] words = new String[count];
        int wordIndex = 0, start = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ' || i == findLength(text) - 1) {
                if (i == findLength(text) - 1) i++; // Include the last character
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.println("Enter a sentence:");
        String text = scanner.nextLine();

        // Use custom method to split text
        String[] customWords = customSplit(text);

        // Use built-in split() method
        String[] splitWords = text.split(" ");

        // Compare the results
        boolean areEqual = compareArrays(customWords, splitWords);

        // Display results
        System.out.println("Custom Split: " + String.join(", ", customWords));
        System.out.println("Built-in Split: " + String.join(", ", splitWords));
        System.out.println("Are both splits equal? " + areEqual);
    }
}
