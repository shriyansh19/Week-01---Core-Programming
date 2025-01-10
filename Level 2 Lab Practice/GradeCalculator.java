import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Variables to store the marks
        int physics, chemistry, maths;
        
        // Prompt the user to enter marks
        System.out.print("Enter marks for Physics: ");
        physics = input.nextInt();
        
        System.out.print("Enter marks for Chemistry: ");
        chemistry = input.nextInt();
        
        System.out.print("Enter marks for Maths: ");
        maths = input.nextInt();
        
        // Calculate the average percentage
        double average = (physics + chemistry + maths) / 3.0;
        
        // Determine the grade based on the average percentage
        char grade;
        String remarks;
        
        if (average >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = 'C';
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }
        
        // Display the average percentage, grade, and remarks
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        // Close the Scanner object
        input.close();
    }
}
