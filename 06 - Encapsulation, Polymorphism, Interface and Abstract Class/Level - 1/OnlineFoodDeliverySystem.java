interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}
abstract class FoodItem {
    protected String itemName;
    protected double price;
    protected int quantity;
    private boolean isOrdered;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.isOrdered = false;
    }
    public abstract double calculateTotalPrice();
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
    public boolean isOrdered() {
        return isOrdered;
    }
    public void markAsOrdered() {
        this.isOrdered = true;
    }
}
class VegItem extends FoodItem implements Discountable {
    private double discount;
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }
    public double calculateTotalPrice() {
        double total = price * quantity;
        return total - (total * discount / 100);
    }
    public void applyDiscount(double percent) {
        this.discount = percent;
    }
    public String getDiscountDetails() {
        return "Discount on " + itemName + ": " + discount + "%";
    }
}
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }
    public double calculateTotalPrice() {
        double extraCharge = 20;
        double total = (price * quantity) + extraCharge;
        return total - (total * discount / 100);
    }
    public void applyDiscount(double percent) {
        this.discount = percent;
    }
    public String getDiscountDetails() {
        return "Discount on " + itemName + ": " + discount + "%";
    }
}
public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem item) {
        if (!item.isOrdered()) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                d.applyDiscount(10);
                System.out.println(d.getDiscountDetails());
            }
            System.out.println("Total Price: ₹" + item.calculateTotalPrice());
            item.markAsOrdered();
            System.out.println("Order placed successfully.\n");
        } else {
            System.out.println(item.itemName + " has already been ordered.\n");
        }
    }
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Chicken Tikka", 275, 3);
        FoodItem f2 = new NonVegItem("Butter Naan", 40, 8);
        FoodItem f3 = new VegItem("French Fries", 180, 3);

        processOrder(f1);
        processOrder(f2);
        processOrder(f3);
        processOrder(f1);
    }
}
