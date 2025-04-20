import java.util.Scanner;
public class ReplaceWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();
        String result = "";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) result += newWord;
            else result += words[i];
            if (i < words.length - 1) result += " ";
        }
        System.out.println("Modified Sentence: " + result);
    }
}
