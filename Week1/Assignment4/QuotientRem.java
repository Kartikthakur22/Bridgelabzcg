package Week1.Assignment4;

import java.util.Scanner;

public class QuotientRem {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] ans=new int[2];
        ans[0]=number%divisor;
        ans[1]=number/divisor;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int number=sc.nextInt();
        System.out.print("Enter divisor:");
        int divisor=sc.nextInt();
        int[] ans=new int[2];
        ans=findRemainderAndQuotient(number,divisor);
        System.out.println("Remainder is "+ans[0]+"and quotient is "+ans[1]);
        sc.close();
    }
}
