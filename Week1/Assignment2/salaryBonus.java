package Week1.Assignment2;

import java.util.Scanner;

public class salaryBonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter salary:");
        int salary=sc.nextInt();
        System.out.print("Enter years:");
        int years=sc.nextInt();
        int bonus=0;
        if(years>5){
            bonus=(5*salary)/100;
        }
        System.out.println("Bonus you will get "+bonus);
        sc.close();
    }
}
