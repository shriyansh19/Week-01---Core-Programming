import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Taking input for salary and years of service
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if the employee is eligible for bonus
        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // 5% bonus
            System.out.println("The bonus amount is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
