import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + (int) (Math.random() * 61); // Random scores between 40 and 100
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotals(int[][] scores) {
        int numStudents = scores.length;
        double[][] result = new double[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double average = (double) total / scores[i].length;
            double percentage = ((double) total / 300) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0; // Rounding to 2 decimal places
            result[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounding to 2 decimal places
        }
        return result;
    }

    // Method to determine the grade based on percentage
    public static String determineGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] totals) {
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-10s%n", 
                (i + 1), 
                scores[i][0], 
                scores[i][1], 
                scores[i][2], 
                totals[i][0], 
                totals[i][2], 
                determineGrade(totals[i][2])
            );
        }
        System.out.println("-------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores for each student
        int[][] scores = generateRandomScores(numStudents);

        // Calculate totals, averages, and percentages
        double[][] totals = calculateTotals(scores);

        // Display the scorecard
        displayScorecard(scores, totals);

        scanner.close();
    }
}
