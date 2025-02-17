package Week1.Assignment3;

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to reverse:");
        int num=sc.nextInt();
        int temp=num,count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        int[] originalArr=new int[count];
        int[] reverseArr=new int[count];
        temp=num;
        int ind=count-1;
        while(temp!=0){
            originalArr[ind]=temp%10;
            temp=temp/10;
            ind--;
        }
        temp=num;
        ind=0;
        while(temp!=0){
            reverseArr[ind]=temp%10;
            temp=temp/10;
            ind++;
        }
        System.out.println("Reversed array:");
        for(int i=0;i<reverseArr.length;i++){
            System.out.print(reverseArr[i]+" ");
        }
        sc.close();
    }
}
