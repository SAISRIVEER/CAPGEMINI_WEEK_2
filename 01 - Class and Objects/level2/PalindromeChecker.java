import java.util.Scanner;

public class PalindromeChecker {
    private String text;

   
    public PalindromeChecker(String text) {
        this.text = text.toLowerCase(); 
    }

   
    public boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String inputText = scanner.nextLine();
        scanner.close();

        PalindromeChecker checker = new PalindromeChecker(inputText);
        checker.displayResult();
    }
}
