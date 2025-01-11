import java.util.Scanner;

public class NumberChecker {
    
    // Method to check if the number is positive or negative
    public static String isPositive(int number) {
        return (number >= 0) ? "positive" : "negative";
    }
    
    // Method to check if the number is even or odd
    public static String isEven(int number) {
        return (number % 2 == 0) ? "even" : "odd";
    }
    
    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;   // num1 is greater
        if (num1 == num2) return 0;  // both are equal
        return -1;                   // num1 is smaller
    }
    
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store 5 numbers
        int[] numbers = new int[5];
        
        // Loop to take user input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            
            // Check if the number is positive or negative
            System.out.println("The number " + numbers[i] + " is " + isPositive(numbers[i]) + ".");
            
            // If the number is positive, check if it is even or odd
            if (numbers[i] >= 0) {
                System.out.println("The number " + numbers[i] + " is " + isEven(numbers[i]) + ".");
            }
        }
        
        // Compare the first and last elements of the array
        int result = compare(numbers[0], numbers[4]);
        
        // Display the comparison result
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
