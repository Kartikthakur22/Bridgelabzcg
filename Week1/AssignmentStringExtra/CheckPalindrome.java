package Week1.AssignmentStringExtra;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        boolean result = isPalindrome(input);
        
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
