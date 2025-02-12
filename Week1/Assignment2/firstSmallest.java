package Week1.Assignment2;

import java.util.Scanner;

public class firstSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        System.out.print("Enter c:");
        int c=sc.nextInt();
        boolean isFirstSmallest=false;
        if(a<b && a<c){
            isFirstSmallest=true;
        }
        System.out.println("Is the first number the smallest? "+isFirstSmallest);
        sc.close();
    }
}
