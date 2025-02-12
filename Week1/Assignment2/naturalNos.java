package Week1.Assignment2;

import java.util.Scanner;

public class naturalNos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Not a natural number");
        }
        else{
            int sumUsingFormula=(n*(n+1))/2;
            int sumUsingWhile=0;
            int i=n;
            while(i>0){
                sumUsingWhile+=i;
                i--;
            }
            System.out.println("Result using formula is "+sumUsingFormula);
            System.out.println("Result using while loop is "+sumUsingWhile);
        }
        sc.close();
    }
}
