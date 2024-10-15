import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysBetweenDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter the first date (YYYY-MM-DD): ");
        LocalDate firstDate = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.print("Enter the second date (YYYY-MM-DD): ");
        LocalDate secondDate = LocalDate.parse(scanner.nextLine(), formatter);

        long daysBetween = java.time.Duration.between(firstDate.atStartOfDay(), secondDate.atStartOfDay()).toDays();
        System.out.println("Days between: " + daysBetween);
    }
}
