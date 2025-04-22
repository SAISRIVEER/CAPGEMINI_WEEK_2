public class MobilePhone5 {

    String brand;
    String model;
    double price;

    public MobilePhone5(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void Display(){

        System.out.println("Brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("price: "+price);
    }

    public static void main(String[] args) {
        MobilePhone5 obj=new MobilePhone5("realme","X50",15000);
        obj.Display();
    }
}
