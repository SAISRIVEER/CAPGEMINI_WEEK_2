public class Vehicle {

    double maxSpeed;
    String fuelType;

    public Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo(){
        System.out.println("\nMax Speed: "+maxSpeed+" kmph");
        System.out.println("fuelType: "+fuelType);
    }
}

class Car extends Vehicle{
    int seatCapacity;

    public Car(double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity: "+seatCapacity);
    }
}

class Truck extends Vehicle{
    int loadCapacity;

    public Truck(double maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Load Capacity: "+loadCapacity+" ton");
    }
}

class Motorcycle extends Vehicle{
    int mileage;

    public Motorcycle(double maxSpeed, String fuelType, int mileage) {
        super(maxSpeed, fuelType);
        this.mileage = mileage;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Mileage: "+mileage+" kmpl");
    }
}
class Veh{
    public static void main(String[] args) {
        Vehicle v=new Vehicle(50,"Diseal");
        Car c=new Car(120,"Petrol",5);
        Truck t=new Truck(80,"Diseal",3);
        Motorcycle m=new Motorcycle(70,"Petrol",60);

        v.displayInfo();
        c.displayInfo();
        t.displayInfo();
        m.displayInfo();
    }
}