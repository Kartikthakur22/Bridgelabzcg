package Week1.AssignmentBuiltin;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        
        System.out.println("The Greatest Common Divisor (GCD) is: " + gcd);
        System.out.println("The Least Common Multiple (LCM) is: " + lcm);
    }

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the formula: LCM(a, b) = |a * b| / GCD(a, b)
    public static int calculateLCM(int a, int b, int gcd) {
        return Math.abs(a * b) / gcd;
    }
}
