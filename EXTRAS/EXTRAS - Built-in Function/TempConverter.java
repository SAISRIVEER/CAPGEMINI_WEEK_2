import java.util.*;
public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double temp = sc.nextDouble();
        if (choice == 1) System.out.println("Fahrenheit: " + (temp * 9 / 5 + 32));
        else if (choice == 2) System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
    }
}
