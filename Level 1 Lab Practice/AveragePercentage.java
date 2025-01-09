class AveragePercentage{
	public static void main(String args[]){
		int maths = 94, physics = 95, chemistry = 96;
		int totalMarks = maths + physics + chemistry;
		double averageMarks = ((double)totalMarks / (double)3);
		
		System.out.print("Average percentage mark of Sam is: " + averageMarks);
	}
}