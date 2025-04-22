public class Book {

    String title;
    String author;
    double price;

    public Book(){
        this.title="Unknown";
        this.author="unknown";
        this.price=0.0;

    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void Display(){

        System.out.println("Title: "+title);
        System.out.println("author: "+author);
        System.out.println("price: "+price);
    }

    public static void main(String[] args) {
        String title="Book";
        String author="sahil sahu";
        double price=500;

        Book obj1=new Book();
        Book obj2=new Book(title,author,price);

        obj1.Display();
        obj2.Display();
    }


}
