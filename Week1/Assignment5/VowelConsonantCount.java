package Week1.Assignment5;

import java.util.Scanner;

public class VowelConsonantCount {

    public static String checkCharacterType(char c) {
        c = Character.toLowerCase(c);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            String result = checkCharacterType(c);
            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(inputText);

        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        scanner.close();
    }
}
