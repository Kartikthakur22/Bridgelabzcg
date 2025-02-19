package Week1.Assignment4;

import java.util.Scanner;

public class CompareSums {
    public static int sumUsingFormula(int n){
        int sum=(n*(n+1))/2;
        return sum;
    }
    public static int sumUsingRecursion(int n){
        if(n==0){
            return 0;
        }
        return n+sumUsingRecursion(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Not a natural number");
        }
        else{
            int sum1=sumUsingFormula(n);
            int sum2=sumUsingRecursion(n);
            System.out.println("Sum using formula:"+sum1);
            System.out.println("Sum using Recursion:"+sum2);
            if(sum1==sum2){
                System.out.println("Both results are equal");
            }
            else{
                System.out.println("Both results are not equal");
            }
        }
        sc.close();
    }
}
