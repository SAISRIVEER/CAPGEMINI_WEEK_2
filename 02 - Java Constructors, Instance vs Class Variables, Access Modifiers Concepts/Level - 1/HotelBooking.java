class HotelBooking {
    String guestName, roomType;
    int nights;
    HotelBooking() {
        guestName = "Sudarsan";
        roomType = "Deluxe";
        nights = 3;
    }
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }
    void display() {
        System.out.println(guestName + " booked a " + roomType + " room for " + nights + " nights.");
    }
    public static void main(String[] args) {
        HotelBooking hb1 = new HotelBooking();
        HotelBooking hb2 = new HotelBooking("Vishal", "VIP Suite", 7);
        HotelBooking hb3 = new HotelBooking(hb2);
        hb1.display();
        hb2.display();
        hb3.display();
    }
}
