package Week1.Assignment2;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check:");
        int originalNum=sc.nextInt();
        int temp=originalNum,sum=0;
        while(temp>0){
            int digit=temp%10;
            sum+=(digit*digit*digit);
            temp/=10;
        }
        if(sum==originalNum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("Not a armstrong number");
        }
        sc.close();
    }
}
