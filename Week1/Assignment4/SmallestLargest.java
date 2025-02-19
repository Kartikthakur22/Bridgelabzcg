package Week1.Assignment4;

import java.util.Scanner;

public class SmallestLargest {
    public static int[] findSmallestAndLargest(int num1, int num2, int num3){
        int[] ans=new int[2];
        ans[0]=Math.min(num1,Math.min(num2,num3));
        ans[1]=Math.max(num1,Math.max(num2,num3));
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1=sc.nextInt();
        System.out.print("Enter number 2:");
        int num2=sc.nextInt();
        System.out.print("Enter number 3:");
        int num3=sc.nextInt();
        int[] ans=new int[2];
        ans=findSmallestAndLargest(num1, num2, num3);
        System.out.println("Among three smallest is "+ans[0]+"and largest is "+ans[1]);
        sc.close();
    }
}
