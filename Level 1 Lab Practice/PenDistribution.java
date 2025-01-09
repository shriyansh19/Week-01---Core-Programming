class PenDistribution{
	public static void main(String args[]){
		int numberOfPens = 14, numberOfStudents = 3;
		int distribution = numberOfPens/numberOfStudents;
		int remainingPens = numberOfPens%numberOfStudents;
		
		System.out.print("The Pen Per Student is " + distribution + " and the remaining pen not distributed is " + remainingPens);
	}
}