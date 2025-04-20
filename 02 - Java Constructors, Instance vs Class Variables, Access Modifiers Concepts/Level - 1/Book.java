class Books {
    String title, author;
    double price;

    Books() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println(title + " by " + author + " - $" + price);
    }
}
public class Book {
    public static void main(String[] args) {
        Books b1 = new Books(); // using default constructor
        Books b2 = new Books("Psychology of Money", "Hanon S. Jame", 890.0); // using parameterized constructor

        b1.display();
        b2.display();
    }
}
