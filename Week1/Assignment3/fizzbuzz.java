package Week1.Assignment3;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        String[] arr=new String[n+1];
        for(int i=0;i<arr.length;i++){
            if(i%3==0 && i%5==0){
                arr[i]="Fizzbuzz";
            }
            else if(i%3==0){
                arr[i]="Fizz";
            }
            else if(i%5==0){
                arr[i]="Buzz";
            }else{
                arr[i]="i";
            }
        }
        for(int i=0;i<arr.length;i++){
           System.out.println("Position "+i+"="+arr[i]);
        }
        sc.close();
    }
}
                