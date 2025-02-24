package Week1.AssignmentStringExtra;

import java.util.Scanner;

public class MostFreqChar {
    public static char mostFrequentChar(String str) {
        int[] frequency = new int[256];
        int maxFrequency = 0;
        char mostFrequentChar = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++;
            if (frequency[ch] > maxFrequency) {
                maxFrequency = frequency[ch];
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        char result = mostFrequentChar(str);
        System.out.println("Most Frequent Character: '" + result + "'");

        scanner.close();
    }
}
