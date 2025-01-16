import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random ages
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; // Random age between 10 and 99
        }
        return ages;
    }

    // Method to classify voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            results[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();

        // Generate ages and check voting eligibility
        int[] ages = generateAges(n);
        String[][] eligibility = checkVotingEligibility(ages);

        // Display results in tabular format
        System.out.println("Age\tEligibility");
        for (String[] pair : eligibility) {
            System.out.println(pair[0] + "\t" + pair[1]);
        }
    }
}
