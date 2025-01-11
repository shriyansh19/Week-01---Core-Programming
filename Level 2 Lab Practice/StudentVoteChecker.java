import java.util.Scanner;

public class StudentVoteChecker {
    
    // Method to check if a student can vote based on their age
    public boolean canStudentVote(int age) {
        // Validate for negative age
        if (age < 0) {
            return false;  // Invalid age
        }
        // Check if age is 18 or above to vote
        return age >= 18;
    }
    
    public static void main(String[] args) {
        // Create an instance of StudentVoteChecker class
        StudentVoteChecker checker = new StudentVoteChecker();
        
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Define an array to store the ages of 10 students
        int[] ages = new int[10];
        
        // Loop through the array to take user input for student ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            
            // Call canStudentVote() to check if the student can vote
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
