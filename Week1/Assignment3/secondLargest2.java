package Week1.Assignment3;

import java.util.Scanner;

public class secondLargest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int maxDigit=10;
        int[] arr=new int[maxDigit];
        System.out.println("Enter the elements:");
        int ind=0;
        for(int i=0;i<=arr.length;i++){
            if(ind==10){
                maxDigit*=2;
                int[] trial=new int[maxDigit];
                for(int a=0;a<10;a++){
                    trial[a]=arr[a];
                }
                arr=trial;
            }
            else if(ind==20){
                break;
            }
            arr[ind]=sc.nextInt();
            ind++;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/10;
        }
        int secondLargest=0,largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest Element:"+largest);
        System.out.println("Second Largest Element:"+secondLargest);
        sc.close();
    }
}
