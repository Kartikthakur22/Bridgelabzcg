package Week1.Assignment5;

import java.util.Scanner;

public class ToUpper {
    public static String convertToUppercase(String text) {
        StringBuilder upperText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase character to uppercase
                ch = (char) (ch - 32);
            }
            upperText.append(ch);
        }
        return upperText.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();

        String uppercaseText = convertToUppercase(inputText);
        String builtInUppercaseText = inputText.toUpperCase();

        System.out.println("Converted using charAt(): " + uppercaseText);
        System.out.println("Converted using built-in toUpperCase(): " + builtInUppercaseText);

        boolean comparisonResult = compareStrings(uppercaseText, builtInUppercaseText);
        System.out.println("Are the results the same? " + comparisonResult);

        scanner.close();
    }
}
