import java.util.Scanner;

public class Circle {


    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){
        this.radius=20;
    }

    public Circle(Circle other){
        this.radius=other.radius;
    }

    public double display(){

        return radius;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius=scanner.nextDouble();

        Circle p1=new Circle();
        Circle p2=new Circle(radius);
        Circle p3=new Circle(p1);
        Circle p4=new Circle(p2);

        System.out.println(p1.display());
        System.out.println(p2.display());
        System.out.println(p3.display());
        System.out.println(p4.display());

    }
}
