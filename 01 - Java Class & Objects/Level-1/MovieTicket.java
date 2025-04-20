class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    void bookTicket(String movie, String seat, double ticketPrice) {
        movieName = movie;
        seatNumber = seat;
        price = ticketPrice;
    }
    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.bookTicket("Good Bad Ugly", "D15", 340);
        t.displayTicket();
    }
}
