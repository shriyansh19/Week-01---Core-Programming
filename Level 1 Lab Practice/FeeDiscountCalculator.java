import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the course fee: ");
        int fee = input.nextInt(); // Taking fee as input

        System.out.print("Enter the discount percentage: ");
        int discountPercent = input.nextInt(); // Taking discount percentage as input

        int discount = (fee * discountPercent) / 100; // Calculating discount
        int finalFee = fee - discount; // Calculating discounted price

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
