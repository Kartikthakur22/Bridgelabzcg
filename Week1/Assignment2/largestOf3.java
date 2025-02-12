package Week1.Assignment2;

import java.util.Scanner;

public class largestOf3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1:");
        int a=sc.nextInt();
        System.out.print("Enter number2:");
        int b=sc.nextInt();
        System.out.print("Enter number3:");
        int c=sc.nextInt();
        int largest=-1;
        if(a>b && a>c){
            largest=a;
        }
        else if(b>a && b>c){
            largest=b;
        }
        else{
            largest=c;
        }
        System.out.println("Is the first number the largest? "+(largest==a));
        System.out.println("Is the second number the largest? "+(largest==b));
        System.out.println("Is the third number the largest? "+(largest==c));
        sc.close();
    }
}
