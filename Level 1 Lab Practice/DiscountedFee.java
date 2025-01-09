public class DiscountedFee {
    public static void main(String[] args) {
        int fee = 125000; // Course fee
        int discountPercent = 10; // Discount percentage
        int discount = (fee * discountPercent) / 100; // Calculating discount
        int finalFee = fee - discount; // Calculating discounted price

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
