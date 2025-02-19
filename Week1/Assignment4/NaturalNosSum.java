package Week1.Assignment4;

import java.util.Scanner;

public class NaturalNosSum {
    public static int sum(int n){
            int sum=(n*(n+1))/2;
            return sum;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("The sum of "+n+" natural numbers is "+sum(n));
        sc.close();
    }
}
