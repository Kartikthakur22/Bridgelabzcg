package Week1.AssignmentStringExtra;

import java.util.Scanner;

public class CountSubstring {
    public static int countSubstringOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main string: ");
        String str = scanner.nextLine();
        System.out.println("Enter the substring: ");
        String substring = scanner.nextLine();

        int count = countSubstringOccurrences(str, substring);
        System.out.println("The substring occurs " + count + " times.");

        scanner.close();
    }
}
