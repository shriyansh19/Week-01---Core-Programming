import java.util.Scanner;

// Class to compute the Distance and Travel Time
class TravelComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Name of the person traveling
        System.out.print("Enter the name of the person traveling: ");
        String name = scanner.nextLine();

        // Input: Cities - fromCity, viaCity, and toCity
        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city via which the person is traveling: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = scanner.nextLine();

        // Input: Distance and Time between fromCity and viaCity
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in km): ");
        double distanceFromToVia = scanner.nextDouble();

        System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = scanner.nextInt();

        // Input: Distance and Time between viaCity and toCity
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in km): ");
        double distanceViaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = scanner.nextInt();

        // Compute total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Output: Travel details
        System.out.println("\nThe Total Distance traveled by " + name + " from " +
                           fromCity + " to " + toCity + " via " + viaCity + 
                           " is " + totalDistance + " km, and the Total Time taken is " + 
                           totalTime + " minutes.");
    }
}
