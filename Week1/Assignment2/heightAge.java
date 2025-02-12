package Week1.Assignment2;

import java.util.Scanner;

public class heightAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age of Amar:");
        int amarAge=sc.nextInt();
        System.out.print("Enter age of Akbar:");
        int akbarAge=sc.nextInt();
        System.out.print("Enter age of Anthony:");
        int anthonyAge=sc.nextInt();
        System.out.print("Enter heigt of Amar:");
        int amarHeight=sc.nextInt();
        System.out.print("Enter height of Akbar:");
        int akbarHeight=sc.nextInt();
        System.out.print("Enter height of Anthony:");
        int anthonyHeight=sc.nextInt();
        if(amarAge<akbarAge && amarAge<anthonyAge){
            System.out.print("Amar is youngest among three");
        }
        else if(akbarAge<amarAge && akbarAge<anthonyAge){
            System.out.print("Akbar is youngest among three");
        }
        else{
            System.out.print("Anthony is youngest among three");
        }
        if(amarHeight>akbarHeight && amarHeight>anthonyHeight){
            System.out.print("Amar is tallest among three");
        }
        else if(akbarHeight>amarHeight && akbarHeight>anthonyHeight){
            System.out.print("Akbar is tallest among three");
        }
        else{
            System.out.print("Anthony is tallest among three");
        }
        sc.close();
    }
}
