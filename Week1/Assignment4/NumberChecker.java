package Week1.Assignment4;

import java.util.Scanner;

public class NumberChecker {
    public static int countDigits(int n){
        int temp=n,count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        return count;
    }
    public static int[] storeDigits(int n,int count){
        int[] digitArray=new int[count];
        int temp=n;
        int ind=count-1;
        while(temp>0){
            digitArray[ind--]=temp%10;
            temp=temp/10;
        }
        return digitArray;
    }
    public static boolean duckOrNot(int[] digitArray){
        for(int digit:digitArray){
            if(digit!=0){
                return true;
            }
        }
        return false;
    }
    public static boolean armstrong(int[] digitArray,int originalNum){
        int sum=0;
        for(int i=0;i<digitArray.length;i++){
            sum+=digitArray[i];
        }
        if(sum==originalNum){
            return true;
        }
        return false;
    }
    public static int[] largestSecondLargest(int[] arr){
        int secondLargest=Integer.MIN_VALUE,largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return new int[]{largest,secondLargest};
    }
    public static int[] smallestSecondSmallest(int[] arr){
        int smallest=Integer.MAX_VALUE,secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondSmallest && arr[i]!=smallest){
                secondSmallest=arr[i];
            }
        }
        return new int[]{smallest,secondSmallest};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    }
}
