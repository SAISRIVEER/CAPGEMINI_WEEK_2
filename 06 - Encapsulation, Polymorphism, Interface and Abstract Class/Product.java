abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    abstract void getTaxDetails();
    abstract double claculateDiscount();

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

interface Taxable{
    double claculateTax();
    void getTaxDetails();
}

class Electronics extends Product implements Taxable{
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double claculateDiscount(){
        return getPrice()*0.15;
    }

    @Override
    public double claculateTax(){
        return getPrice()*0.18;
    }

    @Override
    public void getTaxDetails(){
        System.out.println("Product ID: "+getProductId());
        System.out.println("Name: "+getName());
        System.out.println("Price: "+getPrice());
        System.out.println("Discount: "+claculateDiscount());
        System.out.println("Tax: "+claculateTax());
        System.out.println("Final Price: "+(getPrice()+claculateTax()-claculateDiscount()));
    }
}

class Clothing extends Product implements Taxable{
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }
    @Override
    public double claculateDiscount(){
        return getPrice()*0.13;
    }
    @Override
    public double claculateTax(){
        return getPrice()*0.17;
    }
    @Override
    public  void getTaxDetails(){
        System.out.println("Product ID: "+getProductId());
        System.out.println("Name: "+getName());
        System.out.println("Price: "+getPrice());
        System.out.println("Discount: "+claculateDiscount());
        System.out.println("Tax: "+claculateTax());
        System.out.println("Final Price: "+(getPrice()+claculateTax()-claculateDiscount()));
    }
}

class Groceries extends Product implements Taxable{
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double claculateDiscount(){
        return getPrice()*0.2;
    }

    @Override
    public double claculateTax() {
        return getPrice()*0.25;
    }
    @Override
    public void getTaxDetails(){
        System.out.println("Product ID: "+getProductId());
        System.out.println("Name: "+getName());
        System.out.println("Price: "+getPrice());
        System.out.println("Discount: "+claculateDiscount());
        System.out.println("Tax: "+claculateTax());
        System.out.println("Final Price: "+(getPrice()+claculateTax()-claculateDiscount()));
    }
}

class E_commerce{
    public static void main(String[] args) {
        Product E=new Electronics("41Q5","Mobile",50233);
        Product C=new Clothing("34DF","GUCCI",1200);
        Groceries G=new Groceries("112","Vimal",200);
        G.getTaxDetails();
        E.getTaxDetails();
        C.getTaxDetails();


    }
}

