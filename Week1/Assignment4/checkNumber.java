package Week1.Assignment4;

import java.util.Scanner;

public class checkNumber {
    public static boolean isPositive(int n){
        if(n>0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void compare(int n1,int n2){
        if(n1>n2){
            System.out.println(n1+" is greater");
        }
        else if(n2>n1){
            System.out.println(n2+" is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter element"+(i+1)+":");
            array[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print(array[i]+" is ");
            if(isPositive(array[i])){
                System.out.print("positive and ");
            }else{
                System.out.print("negative and ");
            }
            if(isEven(array[i])){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
        }
        System.out.print("From first and last elements of array which are "+array[0]+" and "+array[1]+" respectively, ");
        compare(array[0],array[4]);
    }
}
