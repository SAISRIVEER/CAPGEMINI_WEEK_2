import java.util.Scanner;

public class Vehicle {

    String ownerName;
    String vehicleType;
    static int registrationFee= 2000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails(){

        System.out.println("\nOwner name: "+ownerName);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Registartion fee: "+registrationFee);
    }

    public static void updateRegistrationFee(int fee){

        registrationFee=fee;
        System.out.println("\nRegistration fee is updated to: "+fee);
    }

    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Jhon","slendor");
        Vehicle v2=new Vehicle("Nick","pulsur");

        System.out.println("Vehicle 1 details: ");
        v1.displayVehicleDetails();
        System.out.println("Vehicle 2 details: ");
        v2.displayVehicleDetails();

        System.out.println("Enter the new registartion fee:");
        Scanner scanner=new Scanner(System.in);
        int fee=scanner.nextInt();
        Vehicle.updateRegistrationFee(fee);

        System.out.println("Updated Vehicle 1 details: ");
        v1.displayVehicleDetails();

        System.out.println("Updated Vehicle 2 details: ");
        v2.displayVehicleDetails();

    }
}
