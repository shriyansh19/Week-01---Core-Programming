import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble(); // Taking user input for distance in km
        double miles = km / 1.6; // Converting km to miles

        System.out.println("The total miles is " + miles + " mile(s) for the given " + km + " km");
    }
}
