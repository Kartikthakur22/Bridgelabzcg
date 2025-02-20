package Week1.Assignment5;

import java.util.Scanner;

public class TrimString {
    public static int[] trimSpaces(String text) {
        int start = 0, end = text.length() - 1;
        
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    public static boolean compareStrings(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        int[] trimmedIndices = trimSpaces(inputText);
        String trimmedText = createSubstring(inputText, trimmedIndices[0], trimmedIndices[1]);

        String builtInTrimmedText = inputText.trim();

        boolean areStringsEqual = compareStrings(trimmedText, builtInTrimmedText);

        System.out.println("Trimmed text using charAt method: \"" + trimmedText + "\"");
        System.out.println("Trimmed text using built-in trim() method: \"" + builtInTrimmedText + "\"");
        System.out.println("Are both trimmed texts equal? " + areStringsEqual);

        scanner.close();
    }
}
