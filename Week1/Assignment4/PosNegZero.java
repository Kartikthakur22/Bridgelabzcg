package Week1.Assignment4;

import java.util.Scanner;

public class PosNegZero {
    public static int checkNumber(int n){
        if(n>0){
            return 1;
        }
        else if(n<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int number = sc.nextInt();
        int ans=checkNumber(number);
        if(ans==1){
            System.out.println(number+" is positive integer");
        }
        else if(ans==-1){
            System.out.println(number+" is negative integer");
        }
        else{
            System.out.println(number+" is zero");
        }
        sc.close();
    }
}
