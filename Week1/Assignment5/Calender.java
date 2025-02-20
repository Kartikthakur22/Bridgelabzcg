package Week1.Assignment5;

import java.util.Scanner;

public class Calender {
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            }
        }
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        return d0;
    }

    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.printf("Calendar for %s %d\n\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int day = 1;
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d ", day++);
        }

        System.out.println();
        while (day <= daysInMonth) {
            for (int i = 0; i < 7 && day <= daysInMonth; i++) {
                System.out.printf("%3d ", day++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);

        scanner.close();
    }
}
