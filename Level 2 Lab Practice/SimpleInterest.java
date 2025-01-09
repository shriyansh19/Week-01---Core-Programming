import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Principal, rate, and time
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output: Simple interest
        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + ", Rate of Interest " + rate + 
                           " and Time " + time + ".");
    }
}
