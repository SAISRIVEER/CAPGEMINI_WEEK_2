import java.util.Scanner;

public class CarRental {

    String CustomerName;
    String CarModel;
    int rentalDays;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.CustomerName = customerName;
        this.CarModel = carModel;
        this.rentalDays = rentalDays;
    }

    public int totalcost(int rentalDays,int rentforaday){

        return rentalDays*rentforaday;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Customer name: ");
        String CustomerName=scanner.nextLine();

        System.out.println("Enter Car Model: ");
        String CarModel=scanner.nextLine();

        System.out.println("Enter number of days to rental: ");
        int rentalDays= scanner.nextInt();
        System.out.println("Rent for each day: ");
        int rentforaday= scanner.nextInt();

        CarRental obj=new CarRental(CustomerName,CarModel,rentalDays);
        System.out.println("Total Rental cost is: "+obj.totalcost(rentalDays,rentforaday));

    }


}
