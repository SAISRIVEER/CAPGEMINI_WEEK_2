import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (op == 1) System.out.println("Result: " + (a + b));
        else if (op == 2) System.out.println("Result: " + (a - b));
        else if (op == 3) System.out.println("Result: " + (a * b));
        else if (op == 4) {
            if (b == 0) System.out.println("Cannot divide by zero");
            else System.out.println("Result: " + (a / b));
        } else System.out.println("Invalid choice");
    }
}
