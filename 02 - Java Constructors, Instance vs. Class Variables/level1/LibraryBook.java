import java.util.Scanner;

class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book '" + title + "' is not available.");
        }
    }


    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }




    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald", 15.99);

        book1.displayBook();


        book1.borrowBook();


        book1.borrowBook();


        book1.displayBook();
    }
}
