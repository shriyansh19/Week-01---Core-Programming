import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3; // Convert feet to yards
        double miles = yards / 1760; // Convert yards to miles

        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}
