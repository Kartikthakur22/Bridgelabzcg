package Week1.Assignment2;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base:");
        int base=sc.nextInt();
        System.out.print("Enter power:");
        int power=sc.nextInt();
        int ans=1;
        for(int i=1;i<=power;i++){
            ans*=base;
        }
        System.out.println("Result:"+ans);
        sc.close();
    }
}
