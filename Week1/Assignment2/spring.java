package Week1.Assignment2;

import java.util.Scanner;

public class spring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month:");
        int month=sc.nextInt();
        System.out.println("Enter day:");
        int day=sc.nextInt();
        if((day>20 && month==3) || month==4 || month==5 ||(day>20 && month==6)){
            System.out.println("It's spring season");
        }
        else{
            System.out.println("Not a spring season");
        }
        sc.close();
    }
}
