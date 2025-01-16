public class NullPointerExceptionDemo {
    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null; // Initializing string to null
        System.out.println(text.length()); // Attempting to access method on null
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        try {
            String text = null; // Initializing string to null
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncomment the next line to see unhandled exception
        // generateNullPointerException();

        // Handling the exception
        handleNullPointerException();
    }
}
