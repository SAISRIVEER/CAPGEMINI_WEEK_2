abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    abstract double calculateRentalCost(int days);

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void printDetails(){
        System.out.println("Vehicle Number: "+getVehicleNumber());
        System.out.println("Type: "+getType());
        System.out.println("Rental rate: "+getRentalRate());
    }
}

interface Insurable{

    double claculateInsurance(int days);
    void getInsuranceDetails();
}

class Car extends Vehicle implements Insurable{

    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    double calculateRentalCost(int days){
        return days*getRentalRate()*0.9;
    }
    @Override
    public double claculateInsurance(int days){
        return getRentalRate()*days*0.1;
    }

    @Override
    public void getInsuranceDetails(){
        System.out.println("Car is insured");

    }
}

class Bike extends Vehicle implements Insurable{

    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    double calculateRentalCost(int days){
        return days*getRentalRate()*0.8;
    }
    @Override
    public double claculateInsurance(int days){
        return getRentalRate()*days*0.2;
    }

    @Override
    public void getInsuranceDetails(){
        System.out.println("Bike is insured");

    }
}
class Truck extends Vehicle implements Insurable{

    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    double calculateRentalCost(int days){
        return days*getRentalRate()*0.7;
    }
    @Override
    public double claculateInsurance(int days){
        return getRentalRate()*days*0.3;
    }

    @Override
    public void getInsuranceDetails(){
        System.out.println("Truck is insured");

    }
}

class RentalSystem{
    public static void main(String[] args) {
        Car c=new Car("TN07BE2486","XUV",200);
        Bike b=new Bike("TN39VK1111","Himalayan",100);
        Truck t=new Truck("TN41Vk1818","5 Ton",250);

        System.out.println("Car Details:");
        c.printDetails();

        System.out.println("\nBike Details:");
        b.printDetails();

        System.out.println("\nTruck Details:");
        t.printDetails();

        // Calculate and display rental cost and insurance cost for each vehicle
        System.out.println("\nCar Rental Cost for 5 Days: " + c.calculateRentalCost(5));
        System.out.println("Car Insurance Cost for 5 Days: " + c.claculateInsurance(5));

        System.out.println("\nBike Rental Cost for 5 Days: " + b.calculateRentalCost(5));
        System.out.println("Bike Insurance Cost for 5 Days: " + b.claculateInsurance(5));

        System.out.println("\nTruck Rental Cost for 5 Days: " + t.calculateRentalCost(5));
        System.out.println("Truck Insurance Cost for 5 Days: " + t.claculateInsurance(5));

        // Display insurance details
        c.getInsuranceDetails();
        b.getInsuranceDetails();
        t.getInsuranceDetails();

    }
}

