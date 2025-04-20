class Vehicle {
    static double registrationFee = 2000;
    final String registrationNumber;
    String ownerName, vehicleType;
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    void display() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration No: " + registrationNumber);
            System.out.println("Fee: $" + registrationFee);
        }
    }
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Vishal", "Bike", "TN1807");
        v.display();
        Vehicle.updateRegistrationFee(6550);
        v.display();
    }
}
