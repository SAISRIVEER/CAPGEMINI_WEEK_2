class Circle {
    double radius;
    double getArea() {
        return Math.PI * radius * radius;
    }
    double getCircumference() {
        return 2 * Math.PI * radius;
    }
    void display() {
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 6.5;
        c.display();
    }
}
