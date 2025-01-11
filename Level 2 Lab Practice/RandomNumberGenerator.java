public class RandomNumberGenerator {

    // Method to generate an array of 4-digit random numbers using Math.random()
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        
        // Generate random 4-digit numbers
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int)(Math.random() * 9000);  // Random number between 1000 and 9999
        }
        
        return randomNumbers;
    }

    // Method to find the average, minimum, and maximum of the array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        
        // Calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        
        double average = (double) sum / numbers.length;  // Calculate average
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        // Generate 5 4-digit random numbers using Math.random()
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        // Display the generated random numbers
        System.out.println("Generated random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Find the average, min, and max of the generated numbers
        double[] results = findAverageMinMax(randomNumbers);
        
        // Display the results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
