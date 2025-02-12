package Week1.Assignment2;

import java.util.Scanner;

public class factorial2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter positive integer:");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("You entered negative value");
        }
        else{
            int ans=1;
            for(int i=1;i<=n;i++){
                ans*=i;
            }
            System.out.println("Factorail:"+ans);
        }
        sc.close();
    }
}
