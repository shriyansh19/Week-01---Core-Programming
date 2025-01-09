import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of the triangle in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height; // Area in square centimeters
        double areaInches = areaCm / 6.4516; // Convert area to square inches

        System.out.println("Area of the triangle: " + areaCm + " cm^2 or " + areaInches + " inches^2");
    }
}
