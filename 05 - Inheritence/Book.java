public class Book {

    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void Display(){
        System.out.println("\ntitle of the book: "+title);
        System.out.println("Publication year: "+publicationYear);
    }
}

class Author extends Book{

    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void Display(){
        super.Display();
        System.out.println("Name of the author: "+name);
        System.out.println("Bio: "+bio);
    }
}

class Boo{
    public static void main(String[] args) {
        Book b1=new Book("Harry",2019);
        Author a1=new Author("Haryy",2019,"Me","Author");
        b1.Display();
        a1.Display();
    }
}
