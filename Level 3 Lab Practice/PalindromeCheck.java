public class PalindromeCheck {

    // Logic 1: Iterative method
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeCharArray(String text) {
        String reversedText = reverseString(text);
        return text.equals(reversedText);
    }

    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String text = "madam";

        // Using Logic 1
        boolean result1 = isPalindromeIterative(text);
        System.out.println("Iterative method: " + (result1 ? "Palindrome" : "Not Palindrome"));

        // Using Logic 2
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Recursive method: " + (result2 ? "Palindrome" : "Not Palindrome"));

        // Using Logic 3
        boolean result3 = isPalindromeCharArray(text);
        System.out.println("Character array method: " + (result3 ? "Palindrome" : "Not Palindrome"));
    }
}
