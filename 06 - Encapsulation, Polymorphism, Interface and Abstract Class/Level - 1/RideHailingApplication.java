interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.location = "Unknown";
    }
    public abstract double calculateFare(double distance);
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: ₹" + ratePerKm;
    }
    protected double getRatePerKm() {
        return ratePerKm;
    }
    protected void setLocation(String location) {
        this.location = location;
    }
    protected String getLocation() {
        return location;
    }
}
class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; // base fare
    }
    public String getCurrentLocation() {
        return getLocation();
    }
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}
class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
    public String getCurrentLocation() {
        return getLocation();
    }
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}
class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }
    public String getCurrentLocation() {
        return getLocation();
    }
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}
public class RideHailingApplication {
    public static void processRide(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        if (vehicle instanceof GPS) {
            GPS gps = (GPS) vehicle;
            gps.updateLocation("Downtown");
            System.out.println("Current Location: " + gps.getCurrentLocation());
        }
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: ₹" + vehicle.calculateFare(distance));
        System.out.println("-----------------------------\n");
    }
    public static void main(String[] args) {
        Vehicle v1 = new Car("C101", "Alice", 15.0);
        Vehicle v2 = new Bike("B202", "Bob", 8.0);
        Vehicle v3 = new Auto("A303", "Charlie", 10.0);

        processRide(v1, 10);
        processRide(v2, 5);
        processRide(v3, 8);
    }
}
