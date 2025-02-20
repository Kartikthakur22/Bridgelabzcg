package Week1.Assignment5;

import java.util.Scanner;

public class StringSplit {
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

    public static String[] splitTextWithoutSplitMethod(String text) {
        int length = findLengthWithoutLengthMethod(text);
        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;

        String[] words = new String[wordCount];
        int start = 0;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                if (i == length - 1) i++;
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        String[] wordsWithoutSplit = splitTextWithoutSplitMethod(inputText);
        String[] wordsWithSplit = inputText.split(" ");

        boolean comparisonResult = compareStringArrays(wordsWithoutSplit, wordsWithSplit);

        System.out.println("Words using user-defined method: ");
        for (String word : wordsWithoutSplit) {
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.println("Words using built-in split() method: ");
        for (String word : wordsWithSplit) {
            System.out.print(word + " ");
        }
        System.out.println();

        System.out.println("Are the results the same? " + comparisonResult);

        scanner.close();
    }
}
