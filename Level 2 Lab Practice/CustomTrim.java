import java.util.Scanner;

public class CustomTrim {

    // Method to trim spaces
    public static String trimSpaces(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return (start <= end) ? text.substring(start, end + 1) : "";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string with leading and trailing spaces:");
        String text = scanner.nextLine();

        // Trim using custom method
        String customTrimmed = trimSpaces(text);

        // Trim using built-in trim()
        String builtInTrimmed = text.trim();

        // Display results
        System.out.println("Custom Trimmed String: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both methods equivalent? " + customTrimmed.equals(builtInTrimmed));
    }
}
