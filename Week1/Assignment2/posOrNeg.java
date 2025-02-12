package Week1.Assignment2;

import java.util.Scanner;

public class posOrNeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Positive");
        }
        else if(n<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        sc.close();
    }
}
