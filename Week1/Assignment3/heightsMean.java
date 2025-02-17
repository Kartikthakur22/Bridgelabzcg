package Week1.Assignment3;

import java.util.Scanner;

public class heightsMean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter heights of football team:");
        double[] arr=new double[11];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextDouble();
        }
        double sumOfHeights=0.0;
        for(int i=0;i<arr.length;i++){
            sumOfHeights+=arr[i];
        }
        double mean=sumOfHeights/11;
        System.out.println("Mean of heights of football team:"+mean);
        sc.close();
    }
}
