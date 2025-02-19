package Week1.Assignment5;

import java.util.Scanner;

public class CompareChar {
    public static char[] usingCharAt(String str){
        char[] arr=new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        return arr;
    }
    public static boolean areEqual(char[] arr1,char[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String str=sc.next();
        char[] arrUsingCharAt=usingCharAt(str);
        char[] arrUsingBuiltin=str.toCharArray();
        System.out.print("Array using char at:");
        for(char ch:arrUsingCharAt){
            System.out.print(ch+" ");
        }
        System.out.print("\nArray using built in method:");
        for(char ch:arrUsingBuiltin){
            System.out.print(ch+" ");
        }
        System.out.println("\nAre both arrays equal:"+areEqual(arrUsingCharAt,arrUsingBuiltin));
    }
}
