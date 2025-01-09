public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378; // Radius in km
        double radiusMiles = radiusKm / 1.6; // Convert radius to miles
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3); // Volume in km^3
        double volumeMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3); // Volume in miles^3

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm);
        System.out.println("The volume of Earth in cubic miles is " + volumeMiles);
    }
}
