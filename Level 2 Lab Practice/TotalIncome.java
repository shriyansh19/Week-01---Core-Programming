import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Salary and Bonus
        System.out.print("Enter your salary (INR): ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your bonus (INR): ");
        double bonus = scanner.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Output: Total income
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome + ".");
    }
}
