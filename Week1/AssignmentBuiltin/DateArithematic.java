package Week1.AssignmentBuiltin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithematic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDate, formatter);

        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);

        newDate = newDate.minusWeeks(3);

        System.out.println("Final Date after manipulation: " + newDate);

        scanner.close();
    }
}
