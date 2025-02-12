package Week1.Assignment2;

import java.util.Scanner;

public class multiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        for(int i=100;i>0;i--){
            if(i%n==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
