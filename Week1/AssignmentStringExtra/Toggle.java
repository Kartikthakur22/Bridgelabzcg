package Week1.AssignmentStringExtra;

import java.util.Scanner;

public class Toggle {
    public static String toggleCase(String input) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 'a' + 'A'));
            } else if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch - 'A' + 'a'));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String toggledString = toggleCase(input);
        System.out.println("Toggled string: " + toggledString);

        scanner.close();
    }
}
