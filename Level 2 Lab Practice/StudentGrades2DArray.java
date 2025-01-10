import java.util.Scanner;

public class StudentGrades2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Step 2: Create a 2D array to store marks and arrays for percentages and grades
        int[][] marks = new int[numberOfStudents][3]; // Each row for a student, columns for Physics, Chemistry, and Math
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Step 3: Input marks for Physics, Chemistry, and Math
        for (int i = 0; i < numberOfStudents; i++) 
		{
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) 
			{
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Math";
                do 
				{
                    System.out.print(subject + " (0-100): ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100)
					System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                } 
				while (marks[i][j] < 0 || marks[i][j] > 100);
            }
        }

        // Step 4: Calculate percentage and grade for each student
        for (int i = 0; i < numberOfStudents; i++) 
		{
            // Calculate percentage using the marks stored in the 2D array
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A'; // Level 4
            } else if (percentages[i] >= 70) {
                grades[i] = 'B'; // Level 3
            } else if (percentages[i] >= 60) {
                grades[i] = 'C'; // Level 2
            } else if (percentages[i] >= 50) {
                grades[i] = 'D'; // Level 1
            } else if (percentages[i] >= 40) {
                grades[i] = 'E'; // Level 1-, too low
            } else {
                grades[i] = 'R'; // Remedial standards
            }
        }

        // Step 5: Display marks, percentage, and grade for each student
        System.out.println("\nStudent\tPhysics\tChemistry\tMath\tPercentage\tGrade");
		
        for (int i = 0; i < numberOfStudents; i++) 
		{
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%c\n",
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
