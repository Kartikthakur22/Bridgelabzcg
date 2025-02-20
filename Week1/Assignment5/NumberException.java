package Week1.Assignment5;

import java.util.Scanner;

public class NumberException {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("The number is: " + number);
    }

    public static void handleException(String text) {
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input, cannot convert to an integer.");
        } catch (RuntimeException e) {
            System.out.println("A runtime exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (e.g., 123 or 'abc'): ");
        String input = scanner.nextLine();
        System.out.println("Generating exception...");
        handleException(input);
        scanner.close();
    }
}
