package Week1.Assignment2;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year to check:");
        int year=sc.nextInt();
        if(year<1582){
            System.out.println("only for years above 1581");
        }
        else if(year%400==0){
            System.out.println("Leap year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}
