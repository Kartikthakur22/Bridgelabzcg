package Week1.Assignment2;

import java.util.Scanner;

public class greatestFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter positive integer:");
        int n=sc.nextInt();
        int greatestFactor=1;
        for(int i=n-1;i>0;i--){
            if(n%i==0){
                greatestFactor=i;
                System.out.print(greatestFactor+" is the greatest factor of "+n);
                break;
            }
        }
        sc.close();
    }
}
