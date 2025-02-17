package Week1.Assignment3;

import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int temp=n,count=1;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        int[] numberArray=new int[count];
        temp=n;
        int ind=count-1;
        while(temp>0){
            numberArray[ind--]=temp%10;
            temp=temp/10;
        }
        int[] freqArray=new int[10];
        for(int i=0;i<count;i++){
            freqArray[numberArray[i]]++;
        }
        for(int i=0;i<10;i++){
            System.out.println("Frequency of "+i+"->"+freqArray[i]);
        }
    }
}
