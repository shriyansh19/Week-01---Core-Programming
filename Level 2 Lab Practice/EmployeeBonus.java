import java.util.Scanner;

class EmployeeBonus {
    public static void main(String args[]) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Declare the number of employees
        int numEmployees = 10;
        
        // Declare arrays for storing salary, years of service, bonus, and new salary
        double[] salary = new double[numEmployees];
        int[] yearsOfService = new int[numEmployees];
        double[] bonus = new double[numEmployees];
        double[] newSalary = new double[numEmployees];
        
        // Variables to store the total old salary, new salary, and total bonus payout
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        double totalBonus = 0.0;
        
        // Loop to get employee data
        for (int i = 0; i < numEmployees; i++) 
		{
            System.out.println("Enter details for employee " + (i + 1));
            
            // Get salary input and validate it
            while (true) 
			{
                System.out.print("Enter the salary: ");
                salary[i] = input.nextDouble();
                if (salary[i] > 0)
				break;
				else
				System.out.println("Invalid salary! Please enter a positive value.");
            }
            
            // Get years of service input and validate it
            while (true) 
			{
                System.out.print("Enter years of service: ");
                yearsOfService[i] = input.nextInt();
				
                if (yearsOfService[i] >= 0)
				break;
				else
				System.out.println("Invalid years of service! Please enter a non-negative value.");
                
            }
        }
        
        // Loop to calculate the bonus, new salary, and the total salary and bonus
        for (int i = 0; i < numEmployees; i++) 
		{
            if (yearsOfService[i] > 5)
			// 5% bonus for employees with more than 5 years of service
			bonus[i] = salary[i] * 0.05;  
			else 
			// 2% bonus for employees with less than or equal to 5 years of service
			bonus[i] = salary[i] * 0.02;  
            
            newSalary[i] = salary[i] + bonus[i];  // Calculate the new salary
            
            totalBonus += bonus[i];  // Add to the total bonus payout
            totalOldSalary += salary[i];  // Add to the total old salary
            totalNewSalary += newSalary[i];  // Add to the total new salary
        }
        
        // Display the total bonus payout, total old salary, and total new salary
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        // Display the bonus and new salary for each employee
        for (int i = 0; i < numEmployees; i++)
        System.out.println("Employee " + (i + 1) + " - Bonus: " + bonus[i] + ", New Salary: " + newSalary[i]);
        
        
        // Close the scanner object
        input.close();
    }
}
