package Week1.Assignment5;

import java.util.Scanner;

public class StringLength {
    public static int findLengthWithoutLengthMethod(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return length;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        int lengthWithoutMethod = findLengthWithoutLengthMethod(input);
        int lengthWithMethod = input.length();

        System.out.println("Length using user-defined method: " + lengthWithoutMethod);
        System.out.println("Length using built-in length() method: " + lengthWithMethod);

        scanner.close();
    }
}
