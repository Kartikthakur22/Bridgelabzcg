package Week1.Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class CheckNumber2 {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    public static boolean isHarshadNumber(int number) {
        int sumOfDigits = sumOfDigits(number);
        return number % sumOfDigits == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2]; 
        
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;  
            frequency[i][1] = 0;  
        }

        for (int digit : digits) {
            frequency[digit][1]++; 
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        System.out.println("Count of digits in " + number + ": " + countDigits(number));
        int[] digits = storeDigits(number);
        System.out.println("Digits of " + number + ": " + Arrays.toString(digits));
        System.out.println("Sum of digits of " + number + ": " + sumOfDigits(number));
        System.out.println("Sum of squares of digits of " + number + ": " + sumOfSquaresOfDigits(number));
        System.out.println("Is " + number + " a Harshad number? " + isHarshadNumber(number));
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit frequencies of " + number + ": ");
        for (int[] freq : frequency) {
            System.out.println("Digit " + freq[0] + ": " + freq[1]);
        }
    }
}
