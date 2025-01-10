import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Step 2: Create arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Step 3: Input marks for Physics, Chemistry, and Math
        for (int i = 0; i < numberOfStudents; i++) 
		{
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            
            // Input and validate Physics marks
            do 
			{
                System.out.print("Physics (0-100): ");
                physicsMarks[i] = scanner.nextInt();
                if (physicsMarks[i] < 0 || physicsMarks[i] > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            } 
			while (physicsMarks[i] < 0 || physicsMarks[i] > 100);

            // Input and validate Chemistry marks
            do 
			{
                System.out.print("Chemistry (0-100): ");
                chemistryMarks[i] = scanner.nextInt();
                if (chemistryMarks[i] < 0 || chemistryMarks[i] > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            } while (chemistryMarks[i] < 0 || chemistryMarks[i] > 100);

            // Input and validate Math marks
            do 
			{
                System.out.print("Math (0-100): ");
                mathMarks[i] = scanner.nextInt();
                if (mathMarks[i] < 0 || mathMarks[i] > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            } 
			while (mathMarks[i] < 0 || mathMarks[i] > 100);
        }

        // Step 4: Calculate percentage and grade for each student
        for (int i = 0; i < numberOfStudents; i++) 
		{
            // Calculate percentage
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathMarks[i]) / 3.0;

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
		System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%c\n", 
                (i + 1), physicsMarks[i], chemistryMarks[i], mathMarks[i], percentages[i], grades[i]);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
