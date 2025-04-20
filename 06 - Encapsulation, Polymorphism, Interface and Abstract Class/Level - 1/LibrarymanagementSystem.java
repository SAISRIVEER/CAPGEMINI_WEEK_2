interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
abstract class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;
    private String borrower;  // Encapsulated personal data
    private boolean isReserved;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
        this.borrower = null;
    }
    public abstract int getLoanDuration();
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }
    public String getBorrower() {
        return borrower;
    }
    public boolean isReserved() {
        return isReserved;
    }
    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 14;  // 14 days for a book
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true);
            setBorrower(borrowerName);
            System.out.println("Book '" + title + "' reserved by " + borrowerName);
        } else {
            System.out.println("Book '" + title + "' is already reserved.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 7;  // 7 days for a magazine
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true);
            setBorrower(borrowerName);
            System.out.println("Magazine '" + title + "' reserved by " + borrowerName);
        } else {
            System.out.println("Magazine '" + title + "' is already reserved.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 3;  // 3 days for a DVD
    }
    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setReserved(true);
            setBorrower(borrowerName);
            System.out.println("DVD '" + title + "' reserved by " + borrowerName);
        } else {
            System.out.println("DVD '" + title + "' is already reserved.");
        }
    }
    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}
public class LibrarymanagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        items[1] = new Magazine("M001", "National Geographic", "Editorial Team");
        items[2] = new DVD("D001", "Inception", "Christopher Nolan");

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Using polymorphism and interface functionality
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                if (reservable.checkAvailability()) {
                    reservable.reserveItem("John Doe");
                }
            }
            System.out.println("Borrower: " + item.getBorrower());
            System.out.println("Available: " + ((Reservable) item).checkAvailability());
            System.out.println("-----------------------------");
        }
    }
}
