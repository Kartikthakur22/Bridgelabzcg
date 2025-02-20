package Week1.Assignment5;

import java.util.Scanner;

public class VowelConsonent {
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

    public static String[][] findCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharacterType(c);
        }
        return result;
    }

    public static void displayResult(String[][] result) {
        System.out.println("Character\tType");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        String[][] characterTypes = findCharacterTypes(inputText);

        displayResult(characterTypes);

        scanner.close();
    }
}
