package Week1.Assignment5;

import java.util.Scanner;

public class CharFreqNested {
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];
        String[] result = new String[chars.length];
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0';  // Mark as visited
                }
            }
            result[i] = String.valueOf(chars[i]) + " : " + count;
        }
        
        return result;
    }

    public static void displayCharacterFrequency(String[] result) {
        System.out.println("Character Frequency:");
        for (String res : result) {
            if (res != null) {
                System.out.println(res);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[] frequencies = findCharacterFrequency(text);

        displayCharacterFrequency(frequencies);

        scanner.close();
    }
}
