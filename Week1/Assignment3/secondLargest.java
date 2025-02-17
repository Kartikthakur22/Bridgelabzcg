package Week1.Assignment3;

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(temp==0){
                break;
            }
            arr[i]=temp;
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
