package Week1.Assignment3;
import java.util.Scanner;
public class tableUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number from 6 to 9:");
        int n=sc.nextInt();
        int[] table=new int[11];
        for(int i=0;i<table.length;i++){
            table[i]=n*i;
            System.out.println(n+"*"+i+"="+table[i]);
        }
        sc.close();
    }
}
