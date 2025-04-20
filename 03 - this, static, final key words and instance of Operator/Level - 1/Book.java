class Book {
    static String libraryName = "Central Library";
    final String isbn;
    String title, author;
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("Library: " + libraryName);
        }
    }
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public static void main(String[] args) {
        Book b = new Book("Psychology of Money", "Houston", "ISBN001");
        b.displayDetails();
        Book.displayLibraryName();
    }
}
