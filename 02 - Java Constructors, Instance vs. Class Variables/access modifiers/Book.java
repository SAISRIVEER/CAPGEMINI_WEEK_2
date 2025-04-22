class Book {

    public int ISBN;
    protected String title;
    private String author;

    public Book(int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails(){

        System.out.println("\nISBN nummber: "+ISBN);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);

    }
}

class Ebook extends Book{

    public Ebook(int ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void EbookDetails(){

        System.out.println("\nISBN: "+ISBN);
        System.out.println("title: "+title);
        System.out.println("Author"+getAuthor());
    }
}

class Main{
    public static void main(String[] args) {
        Book b1=new Book(123456789,"My book","Jhon");
        b1.displayBookDetails();

        b1.setAuthor("Jhon cena");
        System.out.println("Modified author name is: "+b1.getAuthor());
        System.out.println("\nmodified book details: ");
        b1.displayBookDetails();
        Ebook eb1=new Ebook(123789456,"cool boy","alice");
        eb1.EbookDetails();
    }
}
