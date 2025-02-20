package Week1.Assignment5;
import java.util.Scanner;

public class ShortestLongestString {

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

    public static int[] findShortestAndLongestString(String[][] wordsWithLength) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordsWithLength.length; i++) {
            if (Integer.parseInt(wordsWithLength[i][1]) < Integer.parseInt(wordsWithLength[shortestIndex][1])) {
                shortestIndex = i;
            }
            if (Integer.parseInt(wordsWithLength[i][1]) > Integer.parseInt(wordsWithLength[longestIndex][1])) {
                longestIndex = i;
            }
        }

        int[] result = new int[2];
        result[0] = shortestIndex;
        result[1] = longestIndex;

        return result;
    }

    public static void displayShortestAndLongest(String[][] wordsWithLength, int[] indices) {
        System.out.println("Shortest Word: " + wordsWithLength[indices[0]][0] + " (Length: " + wordsWithLength[indices[0]][1] + ")");
        System.out.println("Longest Word: " + wordsWithLength[indices[1]][0] + " (Length: " + wordsWithLength[indices[1]][1] + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        String[] words = splitTextWithoutSplitMethod(inputText);
        String[][] wordsWithLength = getWordsWithLength(words);
        int[] indices = findShortestAndLongestString(wordsWithLength);

        displayShortestAndLongest(wordsWithLength, indices);

        scanner.close();
    }
}

