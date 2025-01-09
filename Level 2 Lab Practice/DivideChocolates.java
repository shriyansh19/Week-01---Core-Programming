import java.util.Scanner;

public class DivideChocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Chocolates and children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate chocolates per child and remainder
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Output: Result
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                           " and the number of remaining chocolates are " + remainingChocolates + ".");
    }
}
