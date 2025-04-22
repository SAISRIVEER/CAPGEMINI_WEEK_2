abstract class FoodItem{
    final private String itemName;
    final private int price;
    final private int quantity;
    public FoodItem(String itemName,int price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    public String getitemName(){
        return itemName;
    }
    public int getPrice(){
        return price;
    }
    public int getquantity(){
        return quantity;
    }
    void displayDetails(){
        System.out.println("Food item: "+itemName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
    }
    @SuppressWarnings("unused")
    abstract int calclatetotalPrice();
}
interface Discountable{
    int applydiscount();
    String getDiscountDetails();
}
class Vegitem extends FoodItem implements Discountable{
    public Vegitem(String itemName,int price,int quantity){
        super(itemName, price, quantity);
    }
    @Override
    public int calclatetotalPrice(){
        return getPrice()*getquantity();
    }
    @Override
    public int applydiscount(){
        return (int)(getPrice()*0.05);
    }
    @Override
    public String getDiscountDetails(){
        return "Veg: 5% discount";
    }


}
class Nonveg extends FoodItem implements Discountable{
    public Nonveg(String itemName,int price,int quantity){
        super(itemName, price, quantity);
    }
    @Override
    public int calclatetotalPrice(){
        return getPrice()*getquantity();
    }
    @Override
    public int applydiscount(){
        return (int)(getPrice()*0.10);
    }
    @Override
    public String getDiscountDetails(){
        return "Non-Veg: 10% discount";
    }

}
class OnlineFood{
    public static void main(String[] args) {
        Vegitem v1=new Vegitem("kajju masala",250,2);
        Nonveg n1=new Nonveg("Chicken keema",350,3);
        int result=v1.calclatetotalPrice()-v1.applydiscount();
        int result1=n1.calclatetotalPrice()-n1.applydiscount();
        System.out.println("-----Item 1------");
        v1.displayDetails();
        System.out.println("The total price: "+v1.calclatetotalPrice());
        System.out.println("Discount: "+v1.applydiscount());
        System.out.println("After appliying discount: "+result);
        System.out.println("Discount details: "+v1.getDiscountDetails());
        System.out.println("--------Item 2-------");
        n1.displayDetails();
        System.out.println("The total price: "+n1.calclatetotalPrice());
        System.out.println("Discount: "+n1.applydiscount());
        System.out.println("After applying discount: "+result1);
        System.out.println("Discount details: "+n1.getDiscountDetails());
    }
}
