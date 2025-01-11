import java.util.Scanner;
class SimpleInterestCalculator
{
	public double calculateSimpleInterest(int principal, double rate, int time)
	{
		double simpleInterest = (principal * rate * time) / 100.0;
		
		return simpleInterest;
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		SimpleInterestCalculator obj = new SimpleInterestCalculator();
		
		System.out.print("Enter the principal: ");
		int principal = input.nextInt();
		
		System.out.print("Enter the rate: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter the time: ");
		int time = input.nextInt();
		
		System.out.println("The Simple Interest is " + obj.calculateSimpleInterest(principal, rate, time) 
		+  ", for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
	}
}