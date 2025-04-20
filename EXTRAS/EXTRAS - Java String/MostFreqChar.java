import java.util.Scanner;
public class MostFreqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        char mostFrequent = ' ';
        int max = 0;
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                mostFrequent = c;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
