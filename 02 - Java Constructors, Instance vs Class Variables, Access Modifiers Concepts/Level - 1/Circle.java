class main {
    double radius;
    main() {
        this(3.0);
    }
    main(double radius) {
        this.radius = radius;
    }
    void display() {
        System.out.println("Radius: " + radius);
    }
}
public class Circle{
    public static void main(String[] args) {
        main c1 = new main();
        main c2 = new main(6.5);

        c1.display();
        c2.display();
    }
}
