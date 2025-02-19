package Week1.Assignment4;

import java.util.Scanner;

public class SpringSeason {
    public static boolean springOrNot(int month,int day){
        if((day>20 && month==3) || month==4 || month==5 ||(day>20 && month==6)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month:");
        int month=sc.nextInt();
        System.out.println("Enter day:");
        int day=sc.nextInt();
        boolean ans=springOrNot(month,day);
        if(ans){
            System.out.println("It's spring season");
        }
        else{
            System.out.println("Not a spring season");
        }
        sc.close();
    }
}
