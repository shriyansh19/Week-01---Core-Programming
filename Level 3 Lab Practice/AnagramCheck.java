import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCounts = new int[256]; // Frequency array for characters

        // Count frequency of characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            charCounts[str1.charAt(i)]++;
        }

        // Decrease frequency based on the second string
        for (int i = 0; i < str2.length(); i++) {
            charCounts[str2.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int count : charCounts) {
            if (count != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        boolean result = areAnagrams(str1, str2);
        System.out.println("Are the two strings anagrams? " + result);
    }
}
