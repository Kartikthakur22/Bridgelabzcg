package Week1.Assignment5;

import java.util.Scanner;

public class ToLower {
    public static String convertToLowercase(String text) {
        StringBuilder lowerText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase character to lowercase
                ch = (char) (ch + 32);
            }
            lowerText.append(ch);
        }
        return lowerText.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();

        String lowercaseText = convertToLowercase(inputText);
        String builtInLowercaseText = inputText.toLowerCase();

        System.out.println("Converted using charAt(): " + lowercaseText);
        System.out.println("Converted using built-in toLowerCase(): " + builtInLowercaseText);

        boolean comparisonResult = compareStrings(lowercaseText, builtInLowercaseText);
        System.out.println("Are the results the same? " + comparisonResult);

        scanner.close();
    }
}
