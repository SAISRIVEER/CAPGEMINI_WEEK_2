import java.time.*;
import java.time.format.*;
public class DateFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println(date.format(f1));
        System.out.println(date.format(f2));
        System.out.println(date.format(f3));
    }
}
