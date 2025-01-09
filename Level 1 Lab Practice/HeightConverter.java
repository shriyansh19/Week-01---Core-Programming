import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble(); // Taking height in cm as input

        double inches = heightCm / 2.54; // Convert cm to inches
        int feet = (int) (inches / 12); // Convert inches to feet
        inches %= 12; // Remaining inches after feet conversion

        System.out.println("Your height in cm is " + heightCm + ", in feet is " + feet + ", and in inches is " + inches);
    }
}
