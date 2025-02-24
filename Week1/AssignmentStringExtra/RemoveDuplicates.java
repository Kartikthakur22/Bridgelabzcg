package Week1.AssignmentStringExtra;

import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; 
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!seen[currentChar]) {
                result.append(currentChar); 
                seen[currentChar] = true;  
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to remove duplicates: ");
        String input = scanner.nextLine();
        String modifiedString = removeDuplicates(input);
        System.out.println("Modified string: " + modifiedString);
        scanner.close();
    }
}
