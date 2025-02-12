package Week1.Assignment2;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter positive integer:");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("You entered negative value");
        }
        else{
            int temp=n;
            int ans=1;
            while(temp>0){
                ans*=temp;
                temp--;
            }
            System.out.println("Factorail:"+ans);
        }
        sc.close();
    }
}
