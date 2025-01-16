import java.util.Random;

public class StudentMarksProcessor {

    public static void main(String[] args) {
        int numberOfStudents = 5; // Number of students
        int[][] scores = generateRandomScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        char[] grades = calculateGrades(results);
        displayScorecards(scores, results, grades);
    }

    // Generate random scores for Physics, Chemistry, and Math
    private static int[][] generateRandomScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3]; // PCM scores for each student
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Physics score between 60 and 100
            scores[i][1] = rand.nextInt(41) + 60; // Chemistry score between 60 and 100
            scores[i][2] = rand.nextInt(41) + 60; // Math score between 60 and 100
        }
        return scores;
    }

    // Calculate total, average, and percentage for each student
    private static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // Total, average, and percentage for each student
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0; // Round off to 2 decimal places
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Calculate grades based on percentage
    private static char[] calculateGrades(double[][] results) {
        char[] grades = new char[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i] = 'A';
            } else if (percentage >= 70) {
                grades[i] = 'B';
            } else if (percentage >= 60) {
                grades[i] = 'C';
            } else if (percentage >= 50) {
                grades[i] = 'D';
            } else if (percentage >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        return grades;
    }

    // Display scorecards of all students
    private static void displayScorecards(int[][] scores, double[][] results, char[] grades) {
        System.out.println("Scorecards:");
        System.out.println("---------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Math | Total | Average | Percentage | Grade");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%7d | %7d | %9d | %4d | %5.0f | %7.2f | %10.2f | %c%n", 
                              i + 1, scores[i][0], scores[i][1], scores[i][2], 
                              results[i][0], results[i][1], results[i][2], grades[i]);
        }
        System.out.println("---------------------------------------------------------");
    }
}
