class Product {
    String productName;
    double price;
    static int totalProducts = 0;
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    void displayProductDetails() {
        System.out.println("Product: " + productName + " | Price: $" + price);
    }
    static void displayTotalProducts() {
        System.out.println("Total products: " + totalProducts);
    }
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Smartphone", 599.49);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
