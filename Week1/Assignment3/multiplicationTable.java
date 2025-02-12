package Week1.Assignment3;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int[] arr=new int[10];
        for(int i=1;i<=arr.length;i++){
            arr[i-1]=n*i;
        }
        for(int i=1;i<=arr.length;i++){
            System.out.println(n+"*"+i+"="+arr[i-1]);
        }
        sc.close();
    }
}
