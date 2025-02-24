package Week1.AssignmentStringExtra;

import java.util.Scanner;

public class RemoveChar {
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.println("Enter the character to remove: ");
        char ch = scanner.next().charAt(0);
        
        String modifiedString = removeCharacter(str, ch);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }
}
