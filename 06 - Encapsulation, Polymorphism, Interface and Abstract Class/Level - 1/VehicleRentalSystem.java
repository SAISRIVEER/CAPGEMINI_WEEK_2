interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle3 {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle3(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    public void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rental Rate: $" + rentalRate);
    }
}
class Car1 extends Vehicle3 implements Insurable {
    public Car1(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10% of the rental rate for insurance
    }
    @Override
    public String getInsuranceDetails() {
        return "Car insurance calculated at 10% of the rental rate.";
    }
}
class Bike1 extends Vehicle3 implements Insurable {
    public Bike1(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of the rental rate for insurance
    }
    @Override
    public String getInsuranceDetails() {
        return "Bike insurance calculated at 5% of the rental rate.";
    }
}
class Truck extends Vehicle3 implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of the rental rate for insurance
    }
    @Override
    public String getInsuranceDetails() {
        return "Truck insurance calculated at 15% of the rental rate.";
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle3[] vehicles = {
                new Car1("7123", 160),
                new Bike1("8456", 80),
                new Truck("7819", 250)
        };

        for (Vehicle3 vehicle : vehicles) {
            vehicle.displayVehicleDetails();
            double rentalCost = vehicle.calculateRentalCost(5); // Calculate cost for 5 days
            double insuranceCost = (vehicle instanceof Insurable) ? ((Insurable) vehicle).calculateInsurance() : 0;
            double totalCost = rentalCost + insuranceCost;
            System.out.println("Rental Cost for 5 days: $" + rentalCost);
            System.out.println("Insurance Cost: $" + insuranceCost);
            System.out.println("Total Cost: $" + totalCost);
            System.out.println("----------------------------");
        }
    }
}
