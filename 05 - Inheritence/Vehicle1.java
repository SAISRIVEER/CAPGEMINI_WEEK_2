class Vehicle1 {
    private int maxSpeed;
    private String model;

    public Vehicle1(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle1 {
    private int batteryCapacity;

    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging " + getModel() + " with battery capacity: " + batteryCapacity + " kWh.");
    }
}

class PetrolVehicle extends Vehicle1 implements Refuelable {
    private int fuelCapacity;

    public PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + getModel() + " with fuel capacity: " + fuelCapacity + " liters.");
    }
}

class VehicleManagementSystem {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
        ev.displayInfo();
        ev.charge();


        PetrolVehicle pv = new PetrolVehicle(200, "Toyota Corolla", 50);
        pv.displayInfo();
        pv.refuel();
    }
}
