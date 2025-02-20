package Week1.Assignment5;

import java.util.Scanner;

public class WordLengthArray {

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

    public static String[][] getWordsWithLength(String[] words) {
        String[][] wordsWithLength = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            wordsWithLength[i][0] = words[i];
            wordsWithLength[i][1] = String.valueOf(words[i].length());
        }
        
        return wordsWithLength;
    }

    public static void displayWordsWithLength(String[][] wordsWithLength) {
        System.out.println("Word\t\tLength");
        for (int i = 0; i < wordsWithLength.length; i++) {
            System.out.println(wordsWithLength[i][0] + "\t\t" + Integer.parseInt(wordsWithLength[i][1]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        String[] words = splitTextWithoutSplitMethod(inputText);
        String[][] wordsWithLength = getWordsWithLength(words);

        displayWordsWithLength(wordsWithLength);

        scanner.close();
    }
}

