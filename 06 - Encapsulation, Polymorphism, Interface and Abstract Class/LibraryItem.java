abstract class LibraryItem {
    String itemId;
    String title;
    String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId(){
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    abstract double getLoanDuration();
    public String getItemDetails(){
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

interface Reservable{
    void reverseItem();
    boolean checkAvailability();
}

class Book extends LibraryItem{
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    double getLoanDuration(){
        return 7;
    }
}

class Magazine extends LibraryItem{
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    double getLoanDuration(){
        return 5;
    }
}

class DVD extends LibraryItem{
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    double getLoanDuration(){
        return 4;
    }
}

class Borrower{

    private String name;
    private double mobileNumber;

    public Borrower(String name, double mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getBorrowerDetails() {
        return "Name: " + name + ", Contact: " + mobileNumber;
    }
}
class ReservableBook extends Book implements Reservable {
    private boolean available;

    public ReservableBook(String itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true; // Default availability
    }

    @Override
    public void reverseItem() {
        if (available) {
            available = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[] {
                new Book("B001", "Java Programming", "James Gosling"),
                new Magazine("M001", "Tech Monthly", "Jane Doe"),
                new DVD("D001", "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println();
        }

        ReservableBook reservableBook = new ReservableBook("B002", "Effective Java", "Joshua Bloch");
        System.out.println(reservableBook.getItemDetails());
        System.out.println("Available: " + reservableBook.checkAvailability());

        reservableBook.reverseItem();
        System.out.println("Available after reservation: " + reservableBook.checkAvailability());

        reservableBook.reverseItem();
    }
}




