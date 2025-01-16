import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String str, int start, int end) {
        System.out.println(str.substring(start, end)); // Invalid indices
    }

    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException(String str, int start, int end) {
        try {
            System.out.println(str.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for string and indices
        System.out.print("Enter the string: ");
        String str = scanner.next();
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        // Uncomment the next line to see unhandled exception
        // generateIllegalArgumentException(str, start, end);

        // Handling the exception
        handleIllegalArgumentException(str, start, end);
    }
}
