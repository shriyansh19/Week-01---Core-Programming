import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] array, int index) {
        System.out.println(array[index]); // Accessing index out of bounds
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] array, int index) {
        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size and elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
		
        String[] array = new String[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.next();
        }

        // Taking input for index
        System.out.print("Enter the index to access: ");
        int index = scanner.nextInt();

        // Uncomment the next line to see unhandled exception
        // generateArrayIndexOutOfBoundsException(array, index);

        // Handling the exception
        handleArrayIndexOutOfBoundsException(array, index);
    }
}
