class LibraryItem {
    public String ISBN;
    protected String title;
    private String author;
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
}
class DigitalItem extends LibraryItem {
    void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title);
    }

    void displayAuthor() {
        System.out.println("Author: " + getAuthor());
    }
}
class LibrarySystem {
    public static void main(String[] args) {
        DigitalItem item = new DigitalItem();
        item.ISBN = "828-0594500805";
        item.title = "Psychology of Money";
        item.setAuthor("Morgan Housel");
        item.display();
        item.displayAuthor();
    }
}
