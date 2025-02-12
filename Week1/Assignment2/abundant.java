package Week1.Assignment2;

import java.util.Scanner;

public class abundant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter positive integer:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum>n){
            System.out.println("Abundant number");
        }
        else{
            System.out.println("Not a abundant number");
        }
        sc.close();
    }
}
