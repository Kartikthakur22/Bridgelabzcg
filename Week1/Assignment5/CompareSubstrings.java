package Week1.Assignment5;

import java.util.Scanner;

public class CompareSubstrings {
    public static String usingCharAt(String str,int s,int e){
        StringBuilder sb=new StringBuilder();
        for(int i=s;i<=e;i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static String usingBuiltin(String str,int s,int e){
        return str.substring(s,e+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string 1:");
        String str=sc.next();
        System.out.print("Enter start index:");
        int startIndex=sc.nextInt();
        System.out.print("Enter end index:");
        int endIndex=sc.nextInt();
        String substringCharAt=usingCharAt(str,startIndex,endIndex);
        String substringBuiltin=usingBuiltin(str,startIndex,endIndex);
        System.out.println("Substring using char at:"+substringCharAt);
        System.out.println("Substring using builtin:"+substringBuiltin);
        if(substringBuiltin.equals(substringCharAt)){
            System.out.println("Both are same");
        }else{
            System.out.println("Not same");
        }
    }
}
