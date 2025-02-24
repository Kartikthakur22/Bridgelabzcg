package Week1.AssignmentStringExtra;

import java.util.Scanner;

public class ReplaceWord {
    public static String replacer(String line,String oldWord,String newWord){
        String[] lineArr=line.split(" ");
        for(int i=0;i<lineArr.length;i++){
            if(lineArr[i]==oldWord){
                lineArr[i]=newWord;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<lineArr.length;i++){
            sb.append(lineArr[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String oldWord=sc.nextLine();
        String newWord=sc.nextLine();
        String ans=replacer(line,oldWord,newWord);
        System.out.println(ans);
        sc.close();
    }
}
