import java.util.Scanner;

public class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType= roomType;
        this.nights = nights;
    }

    public HotelBooking() {

        this.guestName="Jhon";
        this.roomType="Deluxe";
        this.nights=1;
    }

    public HotelBooking(HotelBooking other){
        this.guestName=other.guestName;
        this.roomType=other.roomType;
        this.nights=other.nights;
    }

    public void Display(){
        System.out.println("Guest Name: "+guestName);
        System.out.println("Room type: "+roomType);
        System.out.println("Nights: "+nights);

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name: ");
        String guestName=scanner.nextLine();
        System.out.println("Enter room type: ");
        String roomType=scanner.nextLine();
        System.out.println("Enter number off nights required: ");
        int nights=scanner.nextInt();

        HotelBooking o1=new HotelBooking(guestName,roomType,nights);
        HotelBooking o2=new HotelBooking();
        HotelBooking o3=new HotelBooking(o1);

        o1.Display();
        o2.Display();
        o3.Display();
    }
}
