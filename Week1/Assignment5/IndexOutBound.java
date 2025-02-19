package Week1.Assignment5;

import java.util.Scanner;

public class IndexOutBound {
    public static void generateStringIndexOutOfBoundsException(String text) {
        char character = text.charAt(text.length());
        System.out.println("Character at invalid index: " + character);
    }

    public static void handleStringIndexOutOfBoundsException(String text) {
        try {
            char character = text.charAt(text.length());
            System.out.println("Character at invalid index: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of bounds.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        try {
            generateStringIndexOutOfBoundsException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated: " + e);
        }

        System.out.println("\nHandling StringIndexOutOfBoundsException using try-catch:");
        handleStringIndexOutOfBoundsException(str);

        scanner.close();
    }
}
