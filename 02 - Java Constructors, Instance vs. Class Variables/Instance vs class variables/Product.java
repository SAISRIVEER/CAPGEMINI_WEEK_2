public class Product {


    String productName;
    double price;
    static int totalProducts=0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails(){

        System.out.println("Product Name: "+productName);
        System.out.println("price: "+price);
    }

    public static void displayTotalProducts(){
        System.out.println("Total number of products: "+totalProducts);
    }

    public static void main(String[] args) {
        Product p1=new Product("laptop",5000);
        Product p2=new Product("smartPhone",100);
        Product p3=new Product("Earphones",200);

        System.out.println("Product 1 Details: ");
        p1.displayProductDetails();

        System.out.println("Product 2 Details: ");
        p2.displayProductDetails();

        System.out.println("Product 3 Details: ");
        p3.displayProductDetails();

        System.out.println("\nTotal Products:");
        Product.displayTotalProducts();


    }


}


