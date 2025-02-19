package Week1.Assignment5;

import java.util.Scanner;

public class CompareStrings {
    public static boolean compareWithCharAt(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static boolean compareWithBuiltin(String str1,String str2){
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string 1:");
        String str1=sc.next();
        System.out.print("Enter string 2:");
        String str2=sc.next();
        boolean result1=compareWithCharAt(str1,str2);
        boolean result2=compareWithBuiltin(str1,str2);
        System.out.println("Using charAt :"+result1);
        System.out.println("Using builtin method :"+result2);
        if(result1==result2){
            System.out.println("Both results are same");
        }
        else{
            System.out.println("Both results are not same");
        }
    }
}
