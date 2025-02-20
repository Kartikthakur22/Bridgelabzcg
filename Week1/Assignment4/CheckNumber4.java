package Week1.Assignment4;

import java.util.Scanner;

public class CheckNumber4 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    public static boolean isSpyNumber(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        return sumOfDigits == productOfDigits;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String squareStr = String.valueOf(square);
        String numberStr = String.valueOf(number);
        return squareStr.endsWith(numberStr);
    }

    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check:");
        int number = sc.nextInt();

        System.out.println("Is " + number + " a prime number? " + isPrime(number));
        System.out.println("Is " + number + " a neon number? " + isNeonNumber(number));
        System.out.println("Is " + number + " a spy number? " + isSpyNumber(number));
        System.out.println("Is " + number + " an automorphic number? " + isAutomorphicNumber(number));
        System.out.println("Is " + number + " a buzz number? " + isBuzzNumber(number));
    }
}
