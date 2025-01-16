import java.util.Scanner;

public class StringComparison {
    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
		
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();

        // Comparing using user-defined method
        boolean resultFromCharAt = compareUsingCharAt(str1, str2);

        // Comparing using built-in equals() method
        boolean resultFromEquals = str1.equals(str2);

        // Displaying results
        System.out.println("Comparison using charAt(): " + resultFromCharAt);
        System.out.println("Comparison using equals(): " + resultFromEquals);

        // Checking if both results match
        System.out.println("Results match: " + (resultFromCharAt == resultFromEquals));
		
		scanner.close();
    }
}
