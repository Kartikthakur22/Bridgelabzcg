package Week1.Assignment1;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1:");
        float a=sc.nextInt();
        System.out.print("Enter number 2:");
        float b=sc.nextInt();
        float add=a+b;
        float subt=a-b;
        float mul=a*b;
        float div=a/b;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+a+" and "+b+" is "+add+","+subt+","+mul+" and "+div);
        sc.close();
    }
}