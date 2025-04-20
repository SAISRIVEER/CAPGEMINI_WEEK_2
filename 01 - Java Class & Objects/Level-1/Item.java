class Item {
    int itemCode;
    String itemName;
    double price;
    void displayDetails(int quantity) {
        double totalCost = quantity * price;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Unit Price: $" + price);
        System.out.println("Total Cost for " + quantity + ": $" + totalCost);
    }
    public static void main(String[] args) {
        Item i = new Item();
        i.itemCode = 01;
        i.itemName = "Notebook";
        i.price = 50;
        i.displayDetails(5);
    }
}
