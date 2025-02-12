package Week1.Assignment2;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter positive integer:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i+" is even");
            }
            else{
                System.out.println(i+" is odd");
            }
        }
        sc.close();
    }
}
