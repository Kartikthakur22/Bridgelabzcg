package Week1.Assignment5;

import java.util.Scanner;

public class CharFreq {
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    public static void displayCharacterFrequency(String[][] result) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "        | " + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequencies = findCharacterFrequency(text);

        displayCharacterFrequency(frequencies);

        scanner.close();
    }
}
