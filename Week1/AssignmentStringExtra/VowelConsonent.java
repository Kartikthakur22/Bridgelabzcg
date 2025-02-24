package Week1.AssignmentStringExtra;

import java.util.Scanner;

public class VowelConsonent {
    public static int[] counter(String str){
        int[] count=new int[2];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count[0]++;
            }
            else{
                count[1]++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next().toLowerCase();
        int[] ans=counter(str);
        System.out.println("Number of vowels:"+ans[0]);
        System.out.println("Number of consonents:"+ans[1]);
        sc.close();
    }
}
