package Week1.Assignment3;

import java.util.Scanner;

public class twodToOned {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int r=sc.nextInt();
        System.out.print("Enter number of cols:");
        int c=sc.nextInt();
        System.out.println("Enter elements of 2d array:");
        int[][] matrix=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int[] arr=new int[r*c];
        int ind=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[ind]=matrix[i][j];
                ind++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
