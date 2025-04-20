class MobilePhone {
    String brand;
    String model;
    double price;
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        m.brand = "Iphone";
        m.model = "16 Pro Max";
        m.price = 800;
        m.display();
    }
}
