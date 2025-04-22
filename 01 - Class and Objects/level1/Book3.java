public class Book3 {
    String title;
    String author;
    double price;

    public Book3(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void Display(){

        System.out.println("title: "+title);
        System.out.println("author: "+author);
        System.out.println("price: "+price);
    }

    public static void main(String[] args) {

        String title="Good guys";
        String author="bad guy";
        double price=250;

        Book3 book=new Book3(title,author,price);
        book.Display();
    }
}
