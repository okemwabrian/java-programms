import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth date (YYYY-MM-DD): ");
        String birthDateInput = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateInput);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);
        System.out.println("Your age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days.");
    }
}
