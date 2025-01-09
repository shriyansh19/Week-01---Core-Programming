import java.util.Scanner;

public class IntOperation{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value for a: ");
		int a = input.nextInt();
		
		System.out.print("Enter the value for b: ");
		int b = input.nextInt();
		
		System.out.print("Enter the value for c: ");
		int c = input.nextInt();
		
		System.out.print("The results of Int Operations are " + (a + b * c) + ", " + (a * b + c) + ", " + (c + a / b) + " and " + (a % b + c));
	}
}