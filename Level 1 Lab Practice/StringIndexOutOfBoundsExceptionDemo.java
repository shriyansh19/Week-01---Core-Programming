import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // Accessing index out of bounds
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the string
        System.out.print("Enter a string: ");
        String str = scanner.next();

        // Uncomment the next line to see unhandled exception
        // generateException(str);

        // Handling the exception
        handleException(str);
    }
}
