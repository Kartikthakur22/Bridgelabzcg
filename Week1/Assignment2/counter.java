package Week1.Assignment2;

import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting of counter:");
        int counter=sc.nextInt();
        while(counter>=1){
            System.out.print(counter+" ");
            counter--;
        }
        sc.close();
    }
}
