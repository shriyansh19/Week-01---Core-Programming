import java.util.Scanner;

public class StringLength {

    // Method to find the length of the string without using length() method
    public static int getStringLength(String str) {
        int count = 0;
        try {
            // Infinite loop to count each character in the string
            while (true) {
                // charAt() method will throw StringIndexOutOfBoundsException when index is out of range
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception is caught when index is out of range, thus ending the count
            return count;
        }
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        // Using next() method to take string input from the user
        String inputString = scanner.next();
        
        // Calling the user-defined method to find the length of the string
        int lengthWithoutMethod = getStringLength(inputString);
        
        // Displaying the result of the user-defined method
        System.out.println("Length of the string without using length() method: " + lengthWithoutMethod);
        
        // Calling the built-in length() method to find the length of the string
        int lengthWithMethod = inputString.length();
        
        // Displaying the result of the built-in length() method
        System.out.println("Length of the string using length() method: " + lengthWithMethod);
    }
}
