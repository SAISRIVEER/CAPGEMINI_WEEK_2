public class CircleArea2 {

    double radius;

    public CircleArea2(double radius) {
        this.radius = radius;
    }

    public double AreaofCircle(){

        double area=Math.PI*radius*radius;
        return area;
    }

    public static void main(String[] args) {
        double radius=4.5;
        CircleArea2 circle=new CircleArea2(radius);
        System.out.printf("Area of the circle is: %.2f",circle.AreaofCircle());
    }

}
