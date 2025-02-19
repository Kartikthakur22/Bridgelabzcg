package Week1.Assignment5;

import java.util.Scanner;

public class IlegalArgument {
    public static void generateIllegalArgumentException(String text) {
        String result = text.substring(5, 2);  // This will throw IllegalArgumentException as start index > end index
        System.out.println("Substring result: " + result);
    }

    public static void handleIllegalArgumentException(String text) {
        try {
            String result = text.substring(5, 2);  // This will throw IllegalArgumentException
            System.out.println("Substring result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: Start index is greater than the end index.");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateIllegalArgumentException(str);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated: " + e);
        }

        System.out.println("\nHandling IllegalArgumentException using try-catch:");
        handleIllegalArgumentException(str);

        scanner.close();
    }
}
