package Week1.Assignment4;

import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] ans=new int[2];
        ans[0]=number%divisor;
        ans[1]=number/divisor;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of children:");
        int numberOfChildren=sc.nextInt();
        System.out.print("Enter number of chocolates:");
        int chocolates=sc.nextInt();
        int[] ans=new int[2];
        ans=findRemainderAndQuotient(chocolates,numberOfChildren);
        System.out.println("Remaining chocolates: "+ans[0]+" and number of childrens: "+ans[1]);
        sc.close();
    }
}
