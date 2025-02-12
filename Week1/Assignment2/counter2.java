package Week1.Assignment2;

import java.util.Scanner;

public class counter2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting of counter:");
        int counter=sc.nextInt();
        for(int i=counter;i>=1;i--){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
