package Week1.Assignment2;

import java.util.Scanner;

public class harshadNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check:");
        int originalNum=sc.nextInt();
        int temp=originalNum,sum=0;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        if(originalNum%sum==0){
            System.out.println("harshad number");
        }
        else{
            System.out.println("Not a harshad number");
        }
        sc.close();
    }
}
