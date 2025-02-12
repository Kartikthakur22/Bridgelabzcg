package Week1.Assignment2;

import java.util.Scanner;

public class naturalNos2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Not a natural number");
        }
        else{
            int sumUsingFormula=(n*(n+1))/2;
            int sumUsingLoop=0;
            for(int i=n;i>0;i--){
                sumUsingLoop+=i;
            }
            System.out.println("Result using formula is "+sumUsingFormula);
            System.out.println("Result using while loop is "+sumUsingLoop);
        }
        sc.close();
    }
}
