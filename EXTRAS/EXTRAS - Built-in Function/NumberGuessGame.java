import java.util.*;
public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100, guess;
        String feedback;
        System.out.println("Think of a number between 1 and 100.");
        do {
            guess = low + rand.nextInt(high - low + 1);
            System.out.println("Is your number " + guess + "? (high/low/correct): ");
            feedback = sc.next();
            if (feedback.equals("high")) high = guess - 1;
            else if (feedback.equals("low")) low = guess + 1;
        } while (!feedback.equals("correct"));
        System.out.println("Hurray! Guessed correctly.");
    }
}
