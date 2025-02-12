package Week1.Assignment3;

import java.util.Scanner;

public class canVote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] integer=new int[5];
        System.out.println("Enter 5 integers");
        for(int i=0;i<integer.length;i++){
            integer[i]=sc.nextInt();
        }
        for(int i=0;i<integer.length;i++){
            if(integer[i]>0 && integer[i]%2==0){
                System.out.println("Positive and even");
            }
            else if(integer[i]>0 && integer[i]%2!=0){
                System.out.println("Positive and odd");
            }
            else if(integer[i]<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Zero");
            }
        }
        if(integer[0]==integer[4]){
            System.out.println("First and last elements are equal");
        }
        else if(integer[0]>integer[4]){
            System.out.println("First element is greater");
        }
        else{
            System.out.println("Last element is greater");
        }
        sc.close();
    }
}
