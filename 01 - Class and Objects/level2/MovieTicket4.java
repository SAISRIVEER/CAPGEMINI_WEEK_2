import java.util.Scanner;

public class MovieTicket4 {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket4(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
        this.isBooked = false; // Initially, the ticket is not booked
    }

    // Method to book a ticket
    public void bookTicket(int seatNumber) {
        //this.seatNumber = seatNumber;
        isBooked = true;
        System.out.println("Ticket booked successfully for " + movieName + " (Seat No: " + seatNumber + ")");
    }

    // Method to check if the seat is the same as another ticket
    public boolean isSameSeat(int seatNumber) {
        return this.seatNumber == seatNumber;
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for movie and price
        System.out.println("Enter the movie name:");
        String movieName = scanner.nextLine();
        System.out.println("Enter the ticket price:");
        double price = scanner.nextDouble();

        // Creating ticket for customer 1
        MovieTicket4 customer1 = new MovieTicket4(movieName, price);
        MovieTicket4 customer2 = new MovieTicket4(movieName, price);

        // Customer 1 Booking
        System.out.println("Customer 1, enter seat number:");
        int seat1 = scanner.nextInt();
        customer1.bookTicket(seat1);

        // Customer 2 Booking (with validation)
        int seat2;
        do {
            System.out.println("Customer 2, enter seat number:");
            seat2 = scanner.nextInt();
            if (customer1.isSameSeat(seat2)) {
                System.out.println("Error: Seat " + seat2 + " is already booked. Please choose another seat.");
            }
        } while (customer1.isSameSeat(seat2)); // Repeat until a different seat is entered

        customer2.bookTicket(seat2);

        // Display ticket details
        System.out.println("\nCustomer 1 Ticket Details:");
        customer1.displayTicketDetails();

        System.out.println("\nCustomer 2 Ticket Details:");
        customer2.displayTicketDetails();

        scanner.close();
    }
}
