class Product {
    static double discount = 10;
    final int productID;
    String productName;
    double price;
    int quantity;
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    void display() {
        if (this instanceof Product) {
            double total = price * quantity;
            double discountedPrice = total - (total * discount / 100);
            System.out.println("Product ID: " + productID);
            System.out.println("Product: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total after Discount: $" + discountedPrice);
        }
    }
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    public static void main(String[] args) {
        Product p = new Product(101, "Laptop", 90000, 2);
        p.display();
        Product.updateDiscount(25);
        p.display();
    }
}
