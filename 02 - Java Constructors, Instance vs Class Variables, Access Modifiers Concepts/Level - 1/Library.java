class Library {
    String title, author;
    double price;
    boolean available;
    Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book not available.");
        }
    }
    public static void main(String[] args) {
        Library b1 = new Library("Robbery of 2019", "Harssha Bhogle", 26.99);
        Library b2 = new Library("2019", "Harssha Bhogle", 26.99);

        b1.borrowBook();
        b2.borrowBook();
        b1.borrowBook();
    }
}
