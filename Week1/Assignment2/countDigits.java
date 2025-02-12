package Week1.Assignment2;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int temp=n,count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        System.out.println("Count of digits is "+count);
        sc.close();
    }
}
