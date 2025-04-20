import java.util.Scanner;
public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char toRemove = sc.next().charAt(0);
        String result = "";
        for (char c : str.toCharArray())
            if (c != toRemove) result += c;
        System.out.println("Modified String: " + result);
    }
}
