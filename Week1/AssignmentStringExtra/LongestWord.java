package Week1.AssignmentStringExtra;

import java.util.Scanner;

public class LongestWord {
    public static String longest(String str){
        String[] words = str.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String longestWord=longest(input);
        System.out.println("Longest word: " + longestWord);
        scanner.close();
    }
}
