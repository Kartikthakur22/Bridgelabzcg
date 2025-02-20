package Week1.Assignment5;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        
        for (int i = 0; i < text.length(); i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String text = scanner.nextLine();
        
        boolean resultIterative = isPalindromeIterative(text);
        System.out.println("Palindrome (Iterative): " + resultIterative);

        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome (Recursive): " + resultRecursive);

        boolean resultArray = isPalindromeUsingArray(text);
        System.out.println("Palindrome (Array): " + resultArray);

        scanner.close();
    }
}
