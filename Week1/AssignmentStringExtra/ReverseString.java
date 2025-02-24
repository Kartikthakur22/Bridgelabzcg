package Week1.AssignmentStringExtra;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String str){
        char[] charArray=str.toCharArray();
        int i=0,j=charArray.length-1;
        while(i<j){
            char temp=charArray[i];
            charArray[i]=charArray[j];
            charArray[j]=temp;
            i++;
            j--;
        }
        return new String(charArray);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        String reversed=reverse(str);
        System.out.println("Reversed String:"+reversed);
        sc.close();
    }
}
