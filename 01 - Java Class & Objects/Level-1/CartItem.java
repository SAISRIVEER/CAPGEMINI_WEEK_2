class CartItem {
    String itemName;
    double price;
    int quantity;
    void addItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }
    void removeItem() {
        this.quantity = 0;
        System.out.println("Item removed from cart.");
    }
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Total cost: $" + total);
    }
    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.addItem("Bracelet", 2150, 3);
        c.displayTotalCost();
        c.removeItem();
        c.displayTotalCost();
    }
}
