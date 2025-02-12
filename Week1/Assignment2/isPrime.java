package Week1.Assignment2;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check:");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=n/2;i++){
            if(n%2==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
        sc.close();
    }
}
