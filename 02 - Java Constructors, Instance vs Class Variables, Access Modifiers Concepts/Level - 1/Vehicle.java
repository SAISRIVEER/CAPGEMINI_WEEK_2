class Vehicle {
    String ownerName, vehicleType;
    static double registrationFee = 1335;
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: $" + registrationFee);
    }
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Vishal", "Bike");
        Vehicle v2 = new Vehicle("Resh", "Car");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        updateRegistrationFee(3250);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
