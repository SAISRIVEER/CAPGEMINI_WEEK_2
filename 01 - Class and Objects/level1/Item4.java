public class Item4 {
    String itemCode;
    String itemName;
    double price;

    public Item4(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void Display(){

        System.out.println("itemCode: "+itemCode);
        System.out.println("itemName: "+itemName);
        System.out.println("price: "+price);
    }

    public double totalprice(double quantity){

        return quantity*price;
    }

    public static void main(String[] args) {

        String itemCode="AH128F";
        String itemName="Book";
        double price=250;

        Item4 book=new Item4(itemCode,itemName,price);
        book.Display();

        int quantity=12;
        double totalprice= book.totalprice(quantity);
        System.out.println("total price is: "+totalprice);
    }
}
