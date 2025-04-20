import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.nextLine().replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] s2 = sc.nextLine().replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println(Arrays.equals(s1, s2) ? "Anagrams" : "Not Anagrams");
    }
}
