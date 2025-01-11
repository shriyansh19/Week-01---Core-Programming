public class EmployeeBonus {

    // Method to populate the employee data with random salary and years of service
    public static void populateEmployeeData(int[][] employeeData) {
        for (int i = 0; i < employeeData.length; i++) {
            // Generate a random 5-digit salary
            employeeData[i][0] = (int)(Math.random() * 90000) + 10000;
            // Generate random years of service between 1 and 10
            employeeData[i][1] = (int)(Math.random() * 10) + 1;
        }
    }

    // Method to calculate the new salary and bonus based on the logic defined
    public static void calculateNewSalaryAndBonus(int[][] employeeData, double[][] newEmployeeData) {
        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonusAmount;

            // Save the new salary and bonus amount
            newEmployeeData[i][0] = newSalary;
            newEmployeeData[i][1] = bonusAmount;
        }
    }

    // Method to display the results in a tabular format
    public static void displayResults(int[][] employeeData, double[][] newEmployeeData) {
        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Employee", "Old Salary", "Years of Service", "New Salary", "Bonus Amount");
        System.out.println("---------------------------------------------------------------");

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double newSalary = newEmployeeData[i][0];
            double bonusAmount = newEmployeeData[i][1];

            System.out.printf("%-10d %-15d %-15d %-15.2f %-15.2f%n", (i + 1), oldSalary, yearsOfService, newSalary, bonusAmount);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonusAmount;
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f%n", "Total", totalOldSalary, "", totalNewSalary, totalBonus);
    }
	
	public static void main(String[] args) {
        // Number of employees
        int numEmployees = 10;
        // 2D array to store the old salary and years of service
        int[][] employeeData = new int[numEmployees][2];
        // 2D array to store the new salary and bonus amount
        double[][] newEmployeeData = new double[numEmployees][2];

        // Populate the employee data with random values
        populateEmployeeData(employeeData);

        // Calculate the new salary and bonus based on the logic defined
        calculateNewSalaryAndBonus(employeeData, newEmployeeData);

        // Display the results in a tabular format
        displayResults(employeeData, newEmployeeData);
    }
}
