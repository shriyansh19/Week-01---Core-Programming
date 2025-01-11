import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // Generates a number between 100000 and 999999
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otpArray) {
            // If OTP is already in the set, then it's not unique
            if (!uniqueOTPs.add(otp)) {
                return false;
            }
        }
        return true; // All OTPs are unique
    }
	
	public static void main(String[] args) {
        // Array to save the OTP numbers generated 10 times
        int[] otpArray = new int[10];

        // Generate and save 10 OTPs
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Check if all OTPs are unique
        boolean unique = areOTPsUnique(otpArray);

        // Display the OTPs and the uniqueness result
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }
}
