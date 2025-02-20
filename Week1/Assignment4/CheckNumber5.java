package Week1.Assignment4;

import java.util.Scanner;

public class CheckNumber5 {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 2]; // The second last factor (excluding the number itself)
    }

    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(number) - number; // Exclude the number itself
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == originalNumber;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();
        System.out.println("Factors of " + number + ": ");
        int[] factors = findFactors(number);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest factor of " + number + ": " + greatestFactor(number));
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors(number));
        System.out.println("Product of factors of " + number + ": " + productOfFactors(number));
        System.out.println("Product of cubes of factors of " + number + ": " + productOfCubesOfFactors(number));

        System.out.println("Is " + number + " a perfect number? " + isPerfectNumber(number));
        System.out.println("Is " + number + " an abundant number? " + isAbundantNumber(number));
        System.out.println("Is " + number + " a deficient number? " + isDeficientNumber(number));
        System.out.println("Is " + number + " a strong number? " + isStrongNumber(number));
    }
}
